package comp;

import java.util.*;

public class GptLottoApp {
    // 1~45 사이의 중복 없는 6개 숫자를 생성해 정렬된 리스트로 반환
    public static List<Integer> generateLotto() {
        List<Integer> pool = new ArrayList<>();
        for (int i = 1; i <= 45; i++) pool.add(i);
        Collections.shuffle(pool);
        List<Integer> pick = pool.subList(0, 6);
        Collections.sort(pick);
        return new ArrayList<>(pick);
    }

    // 당첨 번호(6개)와 보너스 1개를 생성 (보너스는 당첨번호와 중복되지 않음)
    public static Map<String, Object> drawWinningNumbers() {
        List<Integer> pool = new ArrayList<>();
        for (int i = 1; i <= 45; i++) pool.add(i);
        Collections.shuffle(pool);
        List<Integer> main = new ArrayList<>(pool.subList(0, 6));
        Collections.sort(main);
        int bonus = pool.get(6);
        Map<String, Object> result = new HashMap<>();
        result.put("main", main);
        result.put("bonus", bonus);
        return result;
    }

    // 맞은 개수와 보너스 포함 여부를 계산
    public static String checkTicket(List<Integer> ticket, List<Integer> winning, int bonus) {
        int match = 0;
        for (int n : ticket) if (winning.contains(n)) match++;
        boolean bonusHit = ticket.contains(bonus);

        if (match == 6) return "1등 (6개 일치)";
        if (match == 5 && bonusHit) return "2등 (5개 + 보너스)";
        if (match == 5) return "3등 (5개)";
        if (match == 4) return "4등 (4개)";
        if (match == 3) return "5등 (3개)";
        return "꽝 (" + match + "개)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 로또 자동 생성기 ===");
        System.out.print("몇 장 구매할래? (숫자 입력): ");
        int n;
        try {
            n = Integer.parseInt(sc.nextLine().trim());
            if (n <= 0) { System.out.println("1 이상의 숫자 입력 필요. 종료합니다."); return; }
        } catch (Exception e) {
            System.out.println("잘못된 입력. 종료합니다.");
            return;
        }

        List<List<Integer>> myTickets = new ArrayList<>();
        for (int i = 0; i < n; i++) myTickets.add(generateLotto());

        System.out.println("\n=== 내 티켓 ===");
        for (int i = 0; i < myTickets.size(); i++) {
            System.out.printf("티켓 %d: %s%n", i+1, myTickets.get(i));
        }

        System.out.println("\n추첨합니다...");
        Map<String, Object> draw = drawWinningNumbers();
        List<Integer> winning = (List<Integer>) draw.get("main");
        int bonus = (int) draw.get("bonus");

        System.out.println("\n=== 당첨 번호 ===");
        System.out.println("당첨 번호: " + winning);
        System.out.println("보너스 번호: " + bonus);

        System.out.println("\n=== 결과 ===");
        for (int i = 0; i < myTickets.size(); i++) {
            String result = checkTicket(myTickets.get(i), winning, bonus);
            System.out.printf("티켓 %d -> %s%n", i+1, result);
        }

        sc.close();
    }
}

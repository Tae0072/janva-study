package Example01;

public class EmpApp {
    public static void main(String[] args) {
    Employee[] employees = new Employee[10];

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Employee e1 = new Employee( "홍길동", "010-1111-1111");
    Employee e2 = new Employee(  "김봉남", "010-2222-2222", "인사팀" , 2, 200, "111", "사원" );
    Employee e3 = new Employee(  "정유자", "010-3333-3333", "인사팀" , 3, 200, "111", "사원" );
    Employee e4 = new Employee(  "김승윤", "010-4444-4444", "인사팀" , 4, 200, "111", "사원");
    Employee e5 = new Employee(  "강두만", "010-5555-5555", "인사팀" , 5, 200, "111", "사원" );
    Employee e6 = new Employee(  "빅헤드", "010-6666-6666", "인사팀" , 6, 200, "111", "사원");
    Employee e7 = new Employee(  "양아지", "010-7777-7777", "인사팀" , 7, 200, "111", "사원" );
    Employee e8 = new Employee(  "양치카", "010-8888-8888", "인사팀" , 8, 200, "111", "사원" );
    Employee e9 = new Employee(  "황린준", "010-9999-9999", "인사팀" , 9, 200, "111", "사원" );
    Employee e10 = new Employee( "김실패", "010-0000-0000", "인사팀" , 10, 200, "111", "사원");

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        e1.setDept("인사팀");
        e1.setEmpNo(1);
        e1.setSalary(200);
        e1.setAccount("111");
        e1.setPosition("사원");

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        employees[5] = e6;
        employees[6] = e7;
        employees[7] = e8;
        employees[8] = e9;
        employees[9] = e10;
        // 3. printInfo 호출 (전체사원)////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        for (int e = 0; e < 10; e++) {
            employees[e].printInfo();
        }

        // 4. 전체사원의 월급의 합 출력//////////////////////////////////////////////////////////////////////////////////////////////////////

        int totalMonthSalary = 0;
        for (int i = 0; i < 10; i++) {
            totalMonthSalary = totalMonthSalary + employees[i].getSalary();
        }
        System.out.println("기본월급 총액 = " + totalMonthSalary + " 원");

        // 5. 전체사원의 연봉의 합 출력//////////////////////////////////////////////////////////////////////////////////////////////////////

        int totalYearSalary = 0;
        for (int i = 0; i < 10; i++) {
            totalYearSalary = totalYearSalary + employees[i].getSalary()*12;
        }
        System.out.println("연봉의 총액 = " + totalYearSalary + " 원");

        // 6. 전체사원의 연봉+보너스 출력//////////////////////////////////////////////////////////////////////////////////////////////////////
        int totalYearSalaryWithBonus = 0;
        for (int i = 0; i < 10; i++) {
            int ySalary = employees[i].getSalary()*12;
            int ySalaryB = 0;
            if (employees[i].getPosition().equals("사원")) {
                ySalaryB = (int) (ySalary*1.1);
            }else if (employees[i].getPosition().equals("대리")) {
                ySalaryB = (int) (ySalary * 1.2);
            }else if (employees[i].getPosition().equals("과장")) {
                ySalaryB = (int) (ySalary * 1.3);
            }else {
                ySalaryB = (int) (ySalary * 1.4);
            }
            totalYearSalaryWithBonus = totalYearSalaryWithBonus + ySalaryB;
        }System.out.println("보너스 포함 연봉 총액 = " + totalYearSalaryWithBonus + "원");

        // 7. 특정 사원 승진 시키기//////////////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < 10; i++) {
            if (employees[i].getName().equals("홍길동")) {
                if (employees[i].getPosition().equals("사원")) {
                    employees[i].setPosition("대리");
                } else if (employees[i].getPosition().equals("대리")) {
                    employees[i].setPosition("과장");
                } else if (employees[i].getPosition().equals("과장")) {
                    employees[i].setPosition("부장");
                }
                for (int e = 0; e < 10; e++) {
                    employees[e].printInfo();
                }
            }
        }
        // 8. 월급 이체 시뮬레이션//////////////////////////////////////////////////////////////////////////////////////////////////////
                for(int i=0; i<10; i++){
                    System.out.println("[급여 이체 완료]"+employees[i].getName()+"님께 10만원이" +employees[i].getaAccount()+"계좌로 지급되었습니다.");

            }
        }
    }
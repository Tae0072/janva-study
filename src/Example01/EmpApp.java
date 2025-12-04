package Example01;

public class EmpApp {
    public static void main(String[] args) {
    Employee[] employees = new Employee[10];

    Employee e1 = new Employee("홍길동", "010-1111-1111");
    Employee e2 = new Employee("장보고", "010-2222-2222", "개발팀");
    Employee e3 = new Employee("이순신", "010-3333-3333", "인사팀", 3, 1000, "8888", "사원");

    employees[0]=e1;
    employees[1]=e2;
    employees[2]=e3;

        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }


        int totalMonthSalary = e1.getSalary();
        System.out.println("기본 연봉 총액 = "+totalMonthSalary+"원");
    }
}

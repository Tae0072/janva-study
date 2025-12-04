package Example01;

public class Employee {
    //1.상태 만들기
    private int empNo;//사원번호
    private int salary;//월급
    private String name;//이름
    private String phone;//전화번호
    private String account;//계좌번호
    private String position;//직급
    private String dept;//부서

    //2. 생성자 만들기(오버로딩)
    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.dept = "미정";
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
    }

    public Employee(String name, String phone, String dept) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
    }

    public Employee(String name, String phone, String dept, int empNo, int salary, String account, String position) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        this.account = account;
        this.position = position;
    }

    //2.책임: 직원의 전체 상태를 모니터로 출력해서 확인
    public void printInfo() {
        System.out.println(name+" / "+phone+ " / "+dept+" / "+empNo+ " / "+position+" / "+salary+" / "+account);
    }
    //3.연봉
    public int clacYerSalary(){
       return salary*12;
    }
    //4. 보너스
    int calcYearSalaryWithBonus() {
        int yearSalary = salary * 12;
        double bonusRate = 0;

        if (position.equals("사원")) {
            bonusRate = 0.10;
        }
        if (position.equals("대리")) {
            bonusRate = 0.20;
        }
        if (position.equals("과장")) {
            bonusRate = 0.30;
        }
        if (position.equals("부장")) {
            bonusRate = 0.40;
        } else {
            bonusRate = 0;
        }

        int bonus = (int)(yearSalary * bonusRate);
        return yearSalary + bonus;
    }
    //5.승진
    public void promote() {
        // 직급 승진
        if (position.equals("사원")) {
            position = "대리";
        } else if (position.equals("대리")) {
            position = "과장";
        } else if (position.equals("과장")) {
            position = "부장";
        } else if (position.equals("부장")) {
            // 부장은 승진 없음
            System.out.println("이미 최고 직급(부장)입니다.");
            return;
        }

        // 월급 10% 인상
        salary = (int)(salary * 1.10);
    }

    //getter + setter
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getaAccount() {
        return account;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

}

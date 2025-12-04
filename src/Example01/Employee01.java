package Example01;

public class Employee01 {
    //1.상태 만들기
    private int empNo;//사원번호
    private int salary;//월급
    private String name;//이름
    private String phone;//전화번호
    private String account;//계좌번호
    private String position;//직급
    private String dept;//부서

    //2. 생성자 만들기(오버로딩)
    Employee01(String name, String phone) {
        dept = "미정";
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }


    public Employee01(String name, String phone, String dept) {
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    Employee01(String name,
               String phone,
               String dept,
               int empNo,
               int salary,
               String account,
               String position) {
    }

    //3.책임: 직원의 전체 상태를 모니터로 출력해서 확인
    public void printInfo() {
        System.out.println(name+" / "+phone+ " / "+dept+" / "+empNo+ " / "+position+" / "+salary+" / "+account);
    }
    public void name(String name) {
        System.out.println(phone+ " / "+dept+" / "+empNo+ " / "+position+" / "+salary+" / "+account);
    }
    public void phone(String name, String phone) {
        System.out.println(dept+" / "+empNo+ " / "+position+" / "+salary+" / "+account);
    }
    public void dept(String name, String phone, String dept) {
        System.out.println(empNo+ " / "+position+" / "+salary+" / "+account);
    }
    public void empNo(String name, String phone, String dept, int empNo) {
        System.out.println(position+" / "+salary+" / "+account);
    }
    public void salary(String name, String phone, String dept, int empNo, int salary) {
        System.out.println(position+" / "+account);
    }
    public void account(String name, String phone, String dept, int empNo, int salary, String account) {
        System.out.println(position+" / ");
    }
    public void position(String name, String phone, String dept, int empNo, int salary, String account, String position) {
        System.out.println();
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

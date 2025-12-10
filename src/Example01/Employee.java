package Example01;

public class Employee {
    //1.상태 만들기
    private String name;        // 이름
    private String phone;       // 전화번호
    private String dept;        // 부서
    private int empNo;          // 사원번호
    private int salary;         // 월급 (정수, 단위: 원)
    private String account;     // 계좌번호
    private String position;    // 직급 (예: "사원", "대리", "과장", "부장")

    //2. 생성자 만들기(오버로딩)


    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Employee(String name, String phone, String dept) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
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


    void  printInfo() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", dept='" + dept + '\'' +
                ", empNo=" + empNo +
                ", salary=" + salary +
                ", account='" + account + '\'' +
                ", position='" + position + '\'' +
                '}');

}
        //getter + setter
        public void setEmpNo ( int empNo){
            this.empNo = empNo;
        }

        public int getEmpNo () {
            return empNo;
        }

        public void setSalary ( int salary){
            this.salary = salary;
        }

        public int getSalary () {
            return salary;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getName () {
            return name;
        }

        public void setPhone (String phone){
            this.phone = phone;
        }

        public String getPhone () {
            return phone;
        }

        public void setAccount (String account){
            this.account = account;
        }

        public String getaAccount () {
            return account;
        }

        public void setPosition (String position){
            this.position = position;
        }

        public String getPosition () {
            return position;
        }

        public void setDept (String dept){
            this.dept = dept;
        }

        public String getDept () {
            return dept;
        }

    }

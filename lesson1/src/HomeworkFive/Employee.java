package HomeworkFive;

public class Employee {
    private String fullName;
    private String position;
    private String employeeEmail;
    private String number;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String employeeEmail,
                                            String number, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.employeeEmail = employeeEmail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void EmployeeStatus(){
        System.out.println("Запрошенная карта сотрудника");
        System.out.println("ФИО сотрудника: " + getFullName());
        System.out.println("Позиция в компании: " + getPosition());
        System.out.println("Email для связи: " + getEmployeeEmail());
        System.out.println("Номер телефона для связи: " + getNumber());
        System.out.println("Заработная плата: " + getSalary());
        System.out.println("Возраст: " + getAge());

    }

//    Все get-методы ---------------------------------------------------
    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }
//    Все set-методы ---------------------------------------------------
    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//    -------------------------------------------------------------------
}

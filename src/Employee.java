public class Employee {
    private static int idCounter=0;
    private int id;
    private String name;
    private int department;
    private int salary;



    public Employee(String name, int department,int salary){
        id=idCounter++;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public int gerId(){
        return id;
}
    public void setDepartment(int department) {
        this.department = department;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

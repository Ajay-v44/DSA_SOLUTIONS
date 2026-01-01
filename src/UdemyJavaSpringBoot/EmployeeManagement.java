package UdemyJavaSpringBoot;

class Employee {
    private final float salary;
    private final String name;

    Employee(float salary, String name) {
        this.name = name;
        this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public String getDetails() {
        return "Name:" + name + ", Salary:" + salary;
    }
}

class Manager extends Employee {
    private final String department;

    Manager(float salary, String name, String department) {
        super(salary, name);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Department:" + this.department;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp = new Employee(1500.0F, "Ram");
        System.out.println(emp.getDetails());
        Employee mngr = new Manager(25000, "Ravi", "IT");
        System.out.println(mngr.getDetails());
    }
}

package practice_problem08;

class Employee {
    public String name;
    public int id;
    public String department;
    public double salary;

    public Employee(String name,int id,String department,double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public double calculatePay() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("ID: "+ id + ", Name: " + name + ", Department: " + department);
        System.out.println("Total Pay: " + salary);
    }
}


class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department, fixedSalary);
    }
}

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department, hourlyRate * hoursWorked);
    }
}

class ContractEmployee extends Employee {
    public String projectName;

    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department, contractAmount);
        this.projectName = projectName;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Project: " + projectName);
    }
}
public class inheritence {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("A", 101, "X", 5000.0);
        PartTimeEmployee pte = new PartTimeEmployee("B", 102, "Y", 20.0, 120);
        ContractEmployee ce = new ContractEmployee("C", 103, "Z", "ABC", 8000.0);


        fte.displayInfo();
        System.out.println();

        pte.displayInfo();
        System.out.println();

        ce.displayInfo();
    }
}

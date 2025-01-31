
public class C06_Employee {
    /*
    We want to create a system where employees in a company are grouped according to their departments.
    We have a list of employees as follows:

    List<Employee> employees = List.of(
    new Employee("Ali", "IT"),
    new Employee("Ayşe", "HR"),
    new Employee("Mehmet", "IT"),
    new Employee("Fatma", "HR"),
    new Employee("Ahmet", "Finance"),
    new Employee("Zeynep", "IT")
    );


     Write a Java program that groups these employees according to their departments.
     The programme should output in the following format:

     IT: [Ali, Mehmet, Zeynep]
     HR: [Ayşe, Fatma]
     Finance: [Ahmet]

     */



    private String name;
    private String department;

    public C06_Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    }



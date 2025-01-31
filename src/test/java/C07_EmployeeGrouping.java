import java.util.*;

public class C07_EmployeeGrouping {
    public static void main(String[] args) {

        // We create the employee list
        List<C06_Employee> employees = List.of(
                new C06_Employee("Ali", "IT"),
                new C06_Employee("Ayşe", "HR"),
                new C06_Employee("Mehmet", "IT"),
                new C06_Employee("Fatma", "HR"),
                new C06_Employee("Ahmet", "Finance"),
                new C06_Employee("Zeynep", "IT")
        );

        // We call the method that groups employees according to departments
        Map<String, List<String>> departmentMap = groupEmployeesByDepartment(employees);

        // We print the results on the screen
        for (Map.Entry<String, List<String>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // A method that groups employees according to their departments
    public static Map<String, List<String>> groupEmployeesByDepartment(List<C06_Employee> employees) {
        Map<String, List<String>> departmentMap = new HashMap<>();

        for (C06_Employee emp : employees) {
            departmentMap.putIfAbsent(emp.getDepartment(), new ArrayList<>());
            departmentMap.get(emp.getDepartment()).add(emp.getName());
        }

        return departmentMap;
    }
}
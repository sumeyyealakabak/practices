import java.util.*;

public class C09_StudentGrouping {
    public static void main(String[] args) {

        // We create the student list
        List<C08_Student> students = List.of(
                new C08_Student("Ali", "Matematik"),
                new C08_Student("Ayşe", "Fizik"),
                new C08_Student("Mehmet", "Matematik"),
                new C08_Student("Fatma", "Kimya"),
                new C08_Student("Ahmet", "Fizik"),
                new C08_Student("Zeynep", "Kimya"),
                new C08_Student("Hasan", "Matematik")
        );

        // We recall the method of grouping students according to subjects
        Map<String, List<String>> subjectMap = groupStudentsBySubject(students);

        // We print the results on the screen
        for (Map.Entry<String, List<String>> entry : subjectMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // A method that groups students according to their courses
    public static Map<String, List<String>> groupStudentsBySubject(List<C08_Student> students) {
        Map<String, List<String>> subjectMap = new HashMap<>();

        for (C08_Student student : students) {
            subjectMap.putIfAbsent(student.getSubject(), new ArrayList<>());
            subjectMap.get(student.getSubject()).add(student.getName());
        }

        return subjectMap;
    }
}
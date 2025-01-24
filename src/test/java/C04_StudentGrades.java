import java.util.*;

public class C04_StudentGrades {
    /*
    Question:
1. Make a system that keeps the grades of a student. Write methods to perform the following operations in this system:

2. Add a grade: Add a grade for a student's name. If the student already exists, update the grade.

3. Calculate average: Calculate the average of all students' grades.

4. List the passing students: Return the names of students who received a grade higher than 50.

5. Find the student with the highest grade: Return the name and grade of the student with the highest grade.
     */

    // Map, who keeps the students' grades
    private Map<String, Integer> studentGrades = new HashMap<>();

    // 1. Not ekleme veya güncelleme metodu
    public void addOrUpdateGrade(String studentName, int grade) {
        studentGrades.put(studentName, grade);
        System.out.println(studentName + " için not eklendi/güncellendi: " + grade);
    }

    // 2. Average calculation method
    public double calculateAverage() {
        if (studentGrades.isEmpty()) {
            System.out.println("Not listesi boş!");
            return 0;
        }
        double total = 0;
        for (int grade : studentGrades.values()) {
            total += grade;
        }
        return total / studentGrades.size();
    }

    // 3. Method of listing passing students
    public List<String> listPassingStudents() {
        List<String> passingStudents = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            if (entry.getValue() > 50) {
                passingStudents.add(entry.getKey());
            }
        }
        return passingStudents;
    }

    // 4. Method of finding the student with the highest grade
    public Map.Entry<String, Integer> findTopStudent() {
        if (studentGrades.isEmpty()) {
            System.out.println("Not listesi boş!");
            return null;
        }
        Map.Entry<String, Integer> topStudent = null;
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            if (topStudent == null || entry.getValue() > topStudent.getValue()) {
                topStudent = entry;
            }
        }
        return topStudent;
    }

    // Main method
    public static void main(String[] args) {
        C04_StudentGrades gradesSystem = new C04_StudentGrades();

        // Adding note
        gradesSystem.addOrUpdateGrade("Ali", 85);
        gradesSystem.addOrUpdateGrade("Ayşe", 42);
        gradesSystem.addOrUpdateGrade("Mehmet", 75);
        gradesSystem.addOrUpdateGrade("Zeynep", 92);

        // Average calculation
        System.out.println("Notların ortalaması: " + gradesSystem.calculateAverage());

        // Listing passing students
        System.out.println("Geçen öğrenciler: " + gradesSystem.listPassingStudents());

        // The student with the highest grade
        Map.Entry<String, Integer> topStudent = gradesSystem.findTopStudent();
        if (topStudent != null) {
            System.out.println("En yüksek notu alan öğrenci: " + topStudent.getKey() + " (" + topStudent.getValue() + ")");
        }
    }
}
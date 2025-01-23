    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class StudentGrades {
        /*
    Question:
We want to develop an application that stores students' names and grades in a classroom.
The students' names will be String and their grades will be Integer. Write a script that asks you to do the following:

1. Store the students' names and grades in a HashMap.
2. Add 5 different students to the map.
3. Print the names and grades of all students on the screen.
4. Get the name of a student from the user and print his/her grade on the screen.
5. If the student is not on the map, display an appropriate message.

Translated with DeepL.com (free version)
     */
        public static void main(String[] args) {
            // 1. Create a HashMap to store students' names and grades
            Map<String, Integer> studentGrades = new HashMap<>();

            // 2. Add 5 different students to the map
            studentGrades.put("Ahmet", 85);
            studentGrades.put("Ayşe", 92);
            studentGrades.put("Mehmet", 78);
            studentGrades.put("Elif", 95);
            studentGrades.put("Ali", 66);

            // 3. Print the names and grades of all students on the screen
            System.out.println("Öğrencilerin isimleri ve notları:");
            for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
                System.out.println("Öğrenci: " + entry.getKey() + ", Not: " + entry.getValue());
            }

            // 4. Get a student's name from the user and show the grade
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nNotunu öğrenmek istediğiniz öğrencinin ismini girin: ");
            String studentName = scanner.nextLine();

            // 5. Check if the student is on the map
            if (studentGrades.containsKey(studentName)) {
                System.out.println(studentName + "'nin notu: " + studentGrades.get(studentName));
            } else {
                System.out.println("Bu isimde bir öğrenci bulunamadı.");
            }

            scanner.close();
        }

}

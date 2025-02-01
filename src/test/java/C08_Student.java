public class C08_Student {

    /*
    In a school, students are grouped according to their subjects.
    We have a list of students as follows:
    List<Student> students = List.of(
    new Student("Ali", "Matematik"),
    new Student("Ayşe", "Fizik"),
    new Student("Mehmet", "Matematik"),
    new Student("Fatma", "Kimya"),
    new Student("Ahmet", "Fizik"),
    new Student("Zeynep", "Kimya"),
    new Student("Hasan", "Matematik")
);

     Write a Java program that groups these students according to their courses.
     The programme should output in the following format:
     Matematik: [Ali, Mehmet, Hasan]
     Fizik: [Ayşe, Ahmet]
     Kimya: [Fatma, Zeynep]

     */
    private String name;
    private String subject;

    public C08_Student(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}

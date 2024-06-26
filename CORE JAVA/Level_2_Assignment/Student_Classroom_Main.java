class Student {
    public void takeExam() {
        System.out.println("Take Exam");
        Classroom.calculateAverageScore();
    }
    public void submitAssignment() {
        System.out.println("Submit Assignment");
    }
}
class Classroom {
    public static void calculateAverageScore() {
        System.out.println("Calculating Average Score");
        Student s = new Student();
        s.submitAssignment();
    }
    public static void conductDiscussion() {
        System.out.println("Conducting Discussion");
    }
}
public class Student_Classroom_Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.takeExam();
    }
}
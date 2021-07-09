class Student {

    String name;
    int grade;
    int number;

    public Student(String studentName, int studentNumber, int studentGrade) {
            name = studentName;
            grade = studentNumber;
            number = studentGrade;

            System.out.println("학생의 이름은 " + name);
            System.out.println("학생의 번호는 " + number);
            System.out.println("학생의 성적은 " + grade);
            }
    }

public class test {

    public static void main(String[] args) {
        Student student1 = new Student("영희", 1, 50);
        Student student2 = new Student("철수", 2, 40);
    }
}

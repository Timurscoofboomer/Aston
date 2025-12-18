import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Student {
    String name;
    String group;
    int course;
    int[] grades;

    Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;

    }

    double averageGrate() {
        int s = 0;
        for (int grate : grades) {
            s = s + grate;
        }
        return (double) s / grades.length;
    }

    static void removeStudentWithLowAverage(ArrayList<Student> students) {
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).averageGrate() < 3) {
                students.remove(i);
            }
        }
    }

    static void upgradeStudent(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).averageGrate() >= 3) {
                students.get(i).course++;
            }
        }
    }

    static void printStudents(Set<Student> students, int course2) {
        for (Student s : students) {
            if (s.course == course2) {
                System.out.println(s.name);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Влад", "Группа 1", 3, new int[]{5, 5, 5});
        Student s2 = new Student("Тимур", "Группа 2", 5, new int[]{3, 2, 3});
        Student s3 = new Student("Юлия", "Группа 3", 2, new int[]{4, 3, 4});
        Student s4 = new Student("Анна", "Группа 1", 3, new int[]{4, 4, 4});
        Student s5 = new Student("Иван", "Группа 2", 2, new int[]{2, 2, 2});

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        removeStudentWithLowAverage(students);
        upgradeStudent(students);

        Set<Student> studentSet = new HashSet<>(students);
        printStudents(studentSet, 3);






    }
}





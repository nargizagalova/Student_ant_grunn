import course.Course;
import group.Group;
import student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(10, "Anna", "Smit", "annasmit");
        Group group = new Group(new Student[]{student}, "Backend", 12);
        Course course = new Course("java", 3, "Timurlan", new Group[]{group});

        System.out.println(student);
        System.out.println(group);
        System.out.println(course);

    }
}
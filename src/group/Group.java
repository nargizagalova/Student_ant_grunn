package group;

import student.Student;

import java.util.Arrays;

public class Group {
    private Student[] students;
    private String title;
    private int date;

    public Group(Student[] students, String title, int date) {
        this.students = students;
        this.title = title;
        this.date = date;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}

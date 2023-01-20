package course;

import group.Group;

import java.util.Arrays;

public class Course {
    private String name;
    private int number;

    private String teacherName;

    private Group[]groups;


    public Course(String name, int number, String teacherName, Group[] groups) {
        this.name = name;
        this.number = number;
        this.teacherName = teacherName;
        this.groups = groups;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", teacherName='" + teacherName + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}


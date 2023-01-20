package student;

public class Student {
    private int birthYear;
    private String name;
    private String surname;
    private String Gmail;

    public Student(int birthYear, String name, String surname, String gmail) {
        if ((2023 - birthYear) < 0) {
            System.out.println("Ошибка! введите не отрицательные числа");
        } else {
            this.birthYear = birthYear;
        }
        this.name = name;
        this.surname = surname;
        Gmail = gmail;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int age) {
        if (age > 0) {

            this.birthYear = age;
        } else {
            System.out.println("Ошибка! введите не отрицательные числа");
        }
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurmame() {
        return surname;
    }

    public void setSurmame(String surmame) {
        this.surname = surmame;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;


    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + birthYear +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Gmail='" + Gmail + '\'' +
                '}';
    }
}


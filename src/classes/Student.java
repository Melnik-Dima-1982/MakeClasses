package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends GeneralClass {
    private String surName;
    private String fistName;
    private String patronymic;
    private int birthDay;
    private String adress;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student() {
    }

    public Student(String surName,
                   String fistName,
                   String patronymic,
                   int birthDay,
                   String adress,
                   String phoneNumber,
                   String faculty,
                   int course,
                   String group) {
        this.surName = surName;
        this.fistName = fistName;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    private String[] studentsSurName = {"Ivanov", "Petrov", "Sidorov"};
    private String[] studentsFistName = {"Ivan", "Igor", "Nikolay", "Dmitry", "Konstantin"};
    private String[] studentsPatronymic = {"Ivanovich", "Igorevich", "Nikolaevich", "Dmitrievich", "Konstantinovich"};
    private int[] studentsBirthDay = {1980, 1982, 1985, 1988, 1990, 1993, 1994, 1996, 1997, 2000};
    private String[] studentsAdress = {"Minsk", "Grodno", "Mogilev", "Gomel", "Vitebsk", "Brest"};
    private String[] studentsPhoneNumber = {"+375-29-10", "+375-29-11", "+375-29-12", "+375-29-13", "+375-29-15", "+375-29-16"};
    private String[] studentsFaculty = {"ATF", "MTF", "MTSIO"};
    private int[] studentsCourse = {1, 2, 3, 4, 5};
    private String[] studentsGroup = {"AS - 45", "SDA - 546", "DG - 989 -AS", "55-DC-FG"};

    @Override
    public String toString() {
        return surName + "\t\t" + fistName + "\t\t" + patronymic + "\t\t" + birthDay +
                "\t\t" + adress + "\t\t" + phoneNumber + "\t\t" + faculty + "\t\t" + course + "\t\t" + group;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    //A method that creates massive objects type Student.
    public Student[] getStudentsMass(int lengthStudentsMass) {
        Student[] studentsMass = new Student[lengthStudentsMass];

        for (int i = 0; i < studentsMass.length; i++) {
            studentsMass[i] = new Student(
                    studentsSurName[(int) (Math.random() * studentsSurName.length)],
                    studentsFistName[(int) (Math.random() * studentsFistName.length)],
                    studentsPatronymic[(int) (Math.random() * studentsPatronymic.length)],
                    studentsBirthDay[(int) (Math.random() * studentsBirthDay.length)],
                    studentsAdress[(int) (Math.random() * studentsAdress.length)],
                    studentsPhoneNumber[(int) (Math.random() * studentsPhoneNumber.length)],
                    studentsFaculty[(int) (Math.random() * studentsFaculty.length)],
                    studentsCourse[(int) (Math.random() * studentsCourse.length)],
                    studentsGroup[(int) (Math.random() * studentsGroup.length)]);
        }
        return studentsMass;
    }

    //Список студентов заданного факультета
    public void listFacultyStudents(Student[] stud) {

        for (int i = 0; i < studentsFaculty.length; i++) {
            int numFaculty = i + 1;
            System.out.println((numFaculty + " - " + studentsFaculty[i]));
        }
        int userInput = getIntUserInput(1, studentsFaculty.length, "faculty:");

        int id = 1;
        for (Student y : stud) {
            if (y.getFaculty().equals(studentsFaculty[userInput - 1])) {
                System.out.println(id + "  " + y.toString());
                id++;
            }
        }
    }

    //Список студентов для каждого факультета
    public void allStunentsOnEveryFaculty(Student[] stud) {

        //Дописать создание ArrayList-ов согласно списку факультетов
        //Учесть название имен
        ArrayList<Student> studentsFirstFaculty = new ArrayList();
        ArrayList<Student> studentsSecondFaculty = new ArrayList();
        ArrayList<Student> studentsThirdFaculty = new ArrayList();

        for (Student y : stud) {
            if (y.getFaculty().equals(studentsFaculty[0])) {
                studentsFirstFaculty.add(y);
            } else if (y.getFaculty().equals(studentsFaculty[1])) {
                studentsSecondFaculty.add(y);
            } else {
                studentsThirdFaculty.add(y);
            }
        }

        int id = 1;
        System.out.println("Faculty - " + studentsFaculty[0] + "\n");
        for (Student y : studentsFirstFaculty) {
            System.out.println(id + "  " + y.toString());
            id++;
        }

        id = 1;
        System.out.println("\n" + "Faculty - " + studentsFaculty[1] + "\n");
        for (Student y : studentsSecondFaculty) {
            System.out.println(id + "  " + y.toString());
            id++;
        }

        id = 1;
        System.out.println("\n" + "Faculty - " + studentsFaculty[2] + "\n");
        for (Student y : studentsThirdFaculty) {
            System.out.println(id + "  " + y.toString());
            id++;
        }
    }

    //Список студентов для каждого курса
    public void allStudentsOfCourse(Student[] stud) {

        ArrayList<Student> studentsFirstCourse = new ArrayList();
        ArrayList<Student> studentsSecondCourse = new ArrayList();
        ArrayList<Student> studentsThirdCourse = new ArrayList();
        ArrayList<Student> studentsFourthCourse = new ArrayList();
        ArrayList<Student> studentsFifthCourse = new ArrayList();

        for (Student y : stud) {
            if (y.getCourse() == studentsCourse[0]) {
                studentsFirstCourse.add(y);
            } else if (y.getCourse() == studentsCourse[1]) {
                studentsSecondCourse.add(y);
            } else if (y.getCourse() == studentsCourse[2]) {
                studentsThirdCourse.add(y);
            } else if (y.getCourse() == studentsCourse[3]) {
                studentsFourthCourse.add(y);
            } else {
                studentsFifthCourse.add(y);
            }
        }

        //Возможно как-то вывод Студентов зациклить
        int id = 1;
        System.out.println("There are Students of " + studentsCourse[0] + " course" + "\n");
        for (Student y : studentsFirstCourse) {
            System.out.println(id + "  " + y.toString());
            id++;
        }

        id = 1;
        System.out.println("\n" + "There are Students of " + studentsCourse[1] + " course" + "\n");
        for (Student y : studentsSecondCourse) {
            System.out.println(id + "  " + y.toString());
            id++;
        }

        id = 1;
        System.out.println("\n" + "There are Students of " + studentsCourse[2] + " course" + "\n");
        for (Student y : studentsThirdCourse) {
            System.out.println(id + "  " + y.toString());
            id++;
        }

        id = 1;
        System.out.println("\n" + "There are Students of " + studentsCourse[3] + " course" + "\n");
        for (Student y : studentsFourthCourse) {
            System.out.println(id + "  " + y.toString());
            id++;
        }

        id = 1;
        System.out.println("\n" + "There are Students of " + studentsCourse[4] + " course" + "\n");
        for (Student y : studentsFifthCourse) {
            System.out.println(id + "  " + y.toString());
            id++;
        }
    }

    //Список студентов родившихся после заданного года
    public void studentsAfterYear(Student[] stud) {

        int userInput = getIntUserInput(studentsBirthDay[0], studentsBirthDay[9], "year of students birthday");

        int id = 1;
        for (Student y : stud) {
            if (y.getBirthDay() >= userInput) {
                System.out.println(id + "  " + y.toString());
                id++;
            }
        }
    }

    //Список учебной группы
    public void studentsFromGroup(Student[] stud) {

        for (int i = 0; i < studentsGroup.length; i++) {
            int numOfGroup = i + 1;
            System.out.println((numOfGroup + " " + studentsGroup[i]));
        }

        int userInput = getIntUserInput(1, studentsGroup.length, "group:"); // scan.nextInt();

        System.out.println(studentsGroup[userInput - 1]);

        int id = 1;
        for (Student y : stud) {
            if (y.getGroup().equals(studentsGroup[userInput - 1])) {
                System.out.println(id + "  " + y.toString());
                id++;
            }
        }
    }

    public String[] getMasStudentsFaculty() {
        return studentsFaculty;
    }
}
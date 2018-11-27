package classes;

import java.security.PublicKey;
import java.util.Scanner;

public class Abiturient extends GeneralClass {
    private String surName;
    private String fistName;
    private String patronymic;
    private int birthDay;
    private String adress;
    private String phoneNumber;
    private int firstMark;
    private int secondtMark;
    private int thirdMark;

    public Abiturient() {
    }

    public Abiturient(String surName,
                      String fistName,
                      String patronymic,
                      int birthDay,
                      String adress,
                      String phoneNumber,
                      int firstMark,
                      int secondtMark,
                      int thirdMark) {
        this.surName = surName;
        this.fistName = fistName;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.firstMark = firstMark;
        this.secondtMark = secondtMark;
        this.thirdMark = thirdMark;
    }

    private String[] abiturientSurName = {"Ivanov", "Petrov", "Sidorov"};
    private String[] abiturientFistName = {"Ivan", "Igor", "Nikolay", "Dmitry", "Konstantin"};
    private String[] abiturientPatronymic = {"Ivanovich", "Igorevich", "Nikolaevich", "Dmitrievich", "Konstantinovich"};
    private int[] abiturientBirthDay = {1980, 1982, 1985, 1988, 1990, 1993, 1994, 1996, 1997, 2000};
    private String[] abiturientAdress = {"Minsk", "Grodno", "Mogilev", "Gomel", "Vitebsk", "Brest"};
    private String[] abiturientPhoneNumber = {"+375-29-10", "+375-29-11", "+375-29-12", "+375-29-13", "+375-29-15", "+375-29-16"};
    private int[] abiturientMarks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    public String toString() {
        return surName + "\t\t" + fistName + "\t\t" + patronymic + "\t\t" + birthDay +
                "\t\t" + adress + "\t\t" + phoneNumber + "\t\t" + firstMark + "\t\t" +
                secondtMark + "\t\t" + thirdMark;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
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

    public int getFirstMark() {
        return firstMark;
    }

    public void setFirstMark(int firstMark) {
        this.firstMark = firstMark;
    }

    public int getSecondtMark() {
        return secondtMark;
    }

    public void setSecondtMark(int secondtMark) {
        this.secondtMark = secondtMark;
    }

    public int getThirdMark() {
        return thirdMark;
    }

    public void setThirdMark(int thirdMark) {
        this.thirdMark = thirdMark;
    }

    //A method that creates massive objects type Abiturient.
    public Abiturient[] makeMassAbiturient(int lengthMassive) {
        Abiturient[] massAbiturient = new Abiturient[lengthMassive];

        for (int i = 0; i < massAbiturient.length; i++) {
            massAbiturient[i] = new Abiturient(
                    abiturientSurName[(int) (Math.random() * abiturientSurName.length)],
                    abiturientFistName[(int) (Math.random() * abiturientFistName.length)],
                    abiturientPatronymic[(int) (Math.random() * abiturientPatronymic.length)],
                    abiturientBirthDay[(int) (Math.random() * abiturientBirthDay.length)],
                    abiturientAdress[(int) (Math.random() * abiturientAdress.length)],
                    abiturientPhoneNumber[(int) (Math.random() * abiturientPhoneNumber.length)],
                    abiturientMarks[(int) (Math.random() * abiturientMarks.length)],
                    abiturientMarks[(int) (Math.random() * abiturientMarks.length)],
                    abiturientMarks[(int) (Math.random() * abiturientMarks.length)]
            );
        }
        return massAbiturient;
    }

    //Список абитуриентов, имеющих неудовлетворительные оценки
    public void abiturientsWithBadMarks(Abiturient[] abitur) {
        System.out.println("Список абитуриентов, имеющих хотя одну оценку меньше 4:");
        int id = 1;
        for (Abiturient y : abitur) {
            if (y.getFirstMark() <= 3 | y.getSecondtMark() <= 3 | y.getThirdMark() <= 3) {
                System.out.println(id + " " + y.toString());
                id++;
            }
        }
    }

    //Вспомогательный метод, вычисляющий средний балл абитуриента
    public double middleMark(Abiturient abitur) {
        double middleMark = 0;
        middleMark = (double) (abitur.getFirstMark() + abitur.getSecondtMark() + abitur.getThirdMark()) / 3;
        return middleMark;
    }

    //Список абитуриентов, средний балл которых выше заданного
    public void abiturientWithHigherMiddleMark(Abiturient[] abitur) {

        double middleMark = getDoubleUserInput(0, 10, "the abiturient's middle mark from");

        int id = 1;
        double abiturientMiddleMark = 0;
        for (Abiturient y : abitur) {
            abiturientMiddleMark = y.middleMark(y);
            if (abiturientMiddleMark >= middleMark) {
                System.out.println(id + " " + y.toString() + "   Сред.оценка - " + abiturientMiddleMark);
                id++;
            }
        }
    }

    //Заданное число абитуриентов, имеющий самый высокий средний балл
    //(вывести также полный список абитуриентов, имеющих полупроходной балл)
    public void abiturientsWithHighestMark(Abiturient[] abitur) {
        int numN = 0;
        int enterdNumber = getIntUserInput(1, abitur.length, "amount abiturients with highest middle mark");

        //Сортировка массива
        Abiturient tempAbiturient;
        for (int i = abitur.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (abitur[j].middleMark(abitur[j]) < abitur[j + 1].middleMark(abitur[j + 1])) {
                    tempAbiturient = abitur[j];
                    abitur[j] = abitur[j + 1];
                    abitur[j + 1] = tempAbiturient;
                }
            }
        }

// Вывод полоного массива абитуриентов
        int id = 1;
        for (Abiturient y : abitur) {
            System.out.println(id + "  " + y.toString() + "  " + y.middleMark(y));
            id++;
        }
        System.out.println();

        //Вывод заданного количества студентов с наивысшими оценками
        id = 1;
        for (Abiturient y : abitur) {
            if (numN == enterdNumber) {
                break;
            }
            System.out.println(id + "  " + y.toString() + "  " + y.middleMark(y));
            numN++;
            id++;
        }
        System.out.println();
//Вывод студентов с полупроходным балом
        id = 1;
        double semiPassingScore = abitur[enterdNumber - 1].middleMark(abitur[enterdNumber - 1]);
        for (Abiturient y : abitur) {
            if (y.middleMark(y) == semiPassingScore) {
                System.out.println(id + "  " + y.toString() + "  " + y.middleMark(y));
                id++;
            }
        }

    }
}

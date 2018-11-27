package classes;

import java.util.Scanner;

public class Patient extends GeneralClass {
    private String surName;
    private String fistName;
    private String patronymic;
    private int birthDay;
    private String adress;
    private String phoneNumber;
    private int numMedicineCard;
    private String diagnosis;

    public Patient() {
    }

    public Patient(String surName,
                   String fistName,
                   String patronymic,
                   int birthDay,
                   String adress,
                   String phoneNumber,
                   int numMedicineCard,
                   String diagnosis) {
        this.surName = surName;
        this.fistName = fistName;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.numMedicineCard = numMedicineCard;
        this.diagnosis = diagnosis;
    }

    private String[] patientSurName = {"Ivanov", "Petrov", "Sidorov"};
    private String[] patientFistName = {"Ivan", "Igor", "Nikolay", "Dmitry", "Konstantin"};
    private String[] patientPatronymic = {"Ivanovich", "Igorevich", "Nikolaevich", "Dmitrievich", "Konstantinovich"};
    private int[] patientBirthDay = {1980, 1982, 1985, 1988, 1990, 1993, 1994, 1996, 1997, 2000};
    private String[] patientAdress = {"Minsk", "Grodno", "Mogilev", "Gomel", "Vitebsk", "Brest"};
    private String[] patientPhoneNumber = {"+375-29-10", "+375-29-11", "+375-29-12", "+375-29-13", "+375-29-15", "+375-29-16"};
    private String[] patientDiagnosis = {"Stomachache", "Headache", "Backache", "Cough", "Sunburn"};

    @Override
    public String toString() {
        return surName + "\t\t" + fistName + "\t\t" + patronymic + "\t\t" + birthDay +
                "\t\t" + adress + "\t\t" + phoneNumber + "\t\t" + numMedicineCard + "\t\t" + diagnosis;
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

    public int getNumMedicineCard() {
        return numMedicineCard;
    }

    public void setNumMedicineCard(int numMedicineCard) {
        this.numMedicineCard = numMedicineCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    //A method that creates massive objects type Patient.
    public Patient[] makeMassPatients(int lengthMassive) {
        Patient[] massPatients = new Patient[lengthMassive];

        for (int i = 0; i < massPatients.length; i++) {
            massPatients[i] = new Patient(
                    patientSurName[(int) (Math.random() * patientSurName.length)],
                    patientFistName[(int) (Math.random() * patientFistName.length)],
                    patientPatronymic[(int) (Math.random() * patientPatronymic.length)],
                    patientBirthDay[(int) (Math.random() * patientBirthDay.length)],
                    patientAdress[(int) (Math.random() * patientAdress.length)],
                    patientPhoneNumber[(int) (Math.random() * patientPhoneNumber.length)],
                    numMedicineCard = (int) (Math.random() * 1000),
                    patientDiagnosis[(int) (Math.random() * patientDiagnosis.length)]);
        }
        return massPatients;
    }

    //Список пациентов, имеющий данный диагноз
    public void patientsWithDiagnosis(Patient[] pat) {

        int numDiagnosis = 1;
        for (String y : patientDiagnosis) {
            System.out.println(numDiagnosis + " " + y);
            numDiagnosis++;
        }

        int userInput = getIntUserInput(1, patientDiagnosis.length, "Diagnosis:");

        int id = 1;
        for (Patient y : pat) {
            if (y.getDiagnosis().equals(patientDiagnosis[userInput - 1])) {
                System.out.println(id + " " + y.toString());
                id++;
            }
        }
    }

    //Список пациентов, номер карты у которых находится в заданном диапазоне
    public void patientsWithNumMedicineCard(Patient[] pat) {

        int firstUserInput = getIntUserInput(1, 900, "first number patient's medicine card");
        int secondUserInput = getIntUserInput(firstUserInput, 1000, "second number patient's medicine card");

        int id = 1;
        for (Patient y : pat) {
            if (y.getNumMedicineCard() >= firstUserInput & y.getNumMedicineCard() <= secondUserInput) {
                System.out.println(id + " " + y.toString());
                id++;
            }
        }
    }
}

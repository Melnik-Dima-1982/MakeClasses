package classes;

import java.util.Calendar;
import java.util.Scanner;

public class Car extends GeneralClass {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private String registrNumber;

    public Car() {
    }

    public Car(String brand, int year, String color, int price, String registrNumber) {
        this.brand = brand;

        if (brand.equals(carsBrand[0])) {
            this.model = mazdaModel[(int) (Math.random() * mazdaModel.length)];
        } else if (brand.equals(carsBrand[1])) {
            this.model = audiModel[(int) (Math.random() * audiModel.length)];
        } else if (brand.equals(carsBrand[2])) {
            this.model = bmwModel[(int) (Math.random() * bmwModel.length)];
        }

        this.year = year;
        this.color = color;
        this.price = price;
        this.registrNumber = registrNumber;
    }

    private String[] carsBrand = {"Mazda", " Audi", "BMW"};
    private String[] mazdaModel = {"CX - 5", "CX - 7", "CX - 9"};
    private String[] audiModel = {"A4", "A6", "A8"};
    private String[] bmwModel = {"X1", "X3", "X5"};
    private int[] carsYear = {2000, 2001, 2002, 2003, 2004, 2005};
    private String[] carsColor = {"red", "blue", "black", "grey"};
    private int[] carsPrice = {10000, 12000, 15000, 17000, 20000, 22000, 25000};
    private String[] carsRegNumber = {"2312-DD", "6516-LL", "4514-DF", "6564-DS", "6565-AA", "4788-WW"};

    @Override
    public String toString() {
        return brand + "\t\t" + model + "\t\t" + year + "\t\t" +
                color + "\t\t" + price + "\t\t" + registrNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistrNumber() {
        return registrNumber;
    }

    public void setRegistrNumber(String registrNumber) {
        this.registrNumber = registrNumber;
    }

    //A method that creates massive objects type Car.
    public Car[] makeMassCar(int lengthMassive) {
        Car[] massCars = new Car[lengthMassive];

        for (int i = 0; i < massCars.length; i++) {
            massCars[i] = new Car(carsBrand[(int) (Math.random() * carsBrand.length)],
                    carsYear[(int) (Math.random() * carsYear.length)],
                    carsColor[(int) (Math.random() * carsColor.length)],
                    carsPrice[(int) (Math.random() * carsPrice.length)],
                    carsRegNumber[(int) (Math.random() * carsRegNumber.length)]
            );
        }
        return massCars;
    }

    //Список автомобилей заданной марки
    public void carsCertainBrand(Car[] cars) {

        int numBrand = 1;
        for (int i = 0; i < carsBrand.length; i++) {
            System.out.println(numBrand + " - " + carsBrand[i]);
            numBrand++;
        }

        int userInput = getIntUserInput(1, carsBrand.length, "number of brand");

        int id = 1;
        for (Car y : cars) {
            if (y.getBrand().equals(carsBrand[userInput - 1])) {
                System.out.println(id + "  " + y.toString());
                id++;
            }
        }
    }

    //Список автомобилей заданной модели, которые эксплуатируются больше n лет
    public void carsCertainBrandWithYear(Car[] cars) {

        int numBrand = 1;
        for (int i = 0; i < carsBrand.length; i++) {
            System.out.println(numBrand + " - " + carsBrand[i]);
            numBrand++;
        }

        int userInput = getIntUserInput(1, carsBrand.length, "number of brand");

        double amountYears = getDoubleUserInput(1, 18, "number of years of car operation");

        Calendar now = Calendar.getInstance();
        int nowYear = now.get(Calendar.YEAR);

        int id = 1;
        for (Car y : cars) {
            int amountCarsYears = nowYear - y.getYear();
            if (y.getBrand().equals(carsBrand[userInput - 1]) & amountCarsYears >= amountYears) {
                System.out.println(id + "  " + y.toString());
            }
        }
    }

    //Список автомобилей заданого года, цена которых выше указанной
    public void carsWithYearWithHigherPrice(Car[] cars) {
        int enteredYear = getIntUserInput(carsYear[0], carsYear[5], "year of car");

        double enteredPrice = getDoubleUserInput(carsPrice[0], carsPrice[6], "price of car");

        int id = 1;
        for (Car y : cars) {
            if (y.getYear() == enteredYear & y.getPrice() >= enteredPrice) {
                System.out.println(id + "  " + y.toString());
                id++;
            }
        }
    }

}

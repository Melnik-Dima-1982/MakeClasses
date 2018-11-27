package classes;

import java.util.Scanner;

public class House extends GeneralClass {
    private int numFlat;
    private double squareFlat;
    private int floorNumber;
    private int amountRooms;
    private String street;
    private int operationPeriod;

    public House() {
    }

    public House(int numFlat,
                 double squareFlat,
                 int floorNumber,
                 int amountRooms,
                 String street,
                 int operationPeriod) {
        this.numFlat = numFlat;
        this.squareFlat = squareFlat;
        this.floorNumber = floorNumber;
        this.amountRooms = amountRooms;
        this.street = street;
        this.operationPeriod = operationPeriod;
    }

    private int[] numberFlats = {100, 110, 120, 130, 140, 150};
    private double[] square = {60.1, 50.55, 48.3, 40.1, 35.8};
    private int[] numFloor = {1, 2, 3, 4, 5};
    private int[] rooms = {1, 2, 3, 4};
    private String[] nameStreet = {"Kozlova", "Aranskaya", "Lenina", "Aranskaya", "Vaneeva"};
    private int[] operPeriod = {25, 30, 35, 40, 45, 50};

    @Override
    public String toString() {
        return numFlat + "\t\t" + squareFlat + "\t\t" + floorNumber + "\t\t" + amountRooms +
                "\t\t" + street + "\t\t" + operationPeriod;
    }

    public int getNumFlat() {
        return numFlat;
    }

    public void setNumFlat(int numFlat) {
        this.numFlat = numFlat;
    }

    public double getSquareFlat() {
        return squareFlat;
    }

    public void setSquareFlat(double squareFlat) {
        this.squareFlat = squareFlat;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getAmountRooms() {
        return amountRooms;
    }

    public void setAmountRooms(int amountRooms) {
        this.amountRooms = amountRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getOperationPeriod() {
        return operationPeriod;
    }

    public void setOperationPeriod(int operationPeriod) {
        this.operationPeriod = operationPeriod;
    }

    //A method that creates massive objects type House.
    public House[] makeMassHouse(int lengthMassive) {
        House[] massHouse = new House[lengthMassive];

        for (int i = 0; i < massHouse.length; i++) {
            massHouse[i] = new House(
                    numberFlats[(int) (Math.random() * numberFlats.length)],
                    square[(int) (Math.random() * square.length)],
                    numFloor[(int) (Math.random() * numFloor.length)],
                    rooms[(int) (Math.random() * rooms.length)],
                    nameStreet[(int) (Math.random() * nameStreet.length)],
                    operPeriod[(int) (Math.random() * operPeriod.length)]
            );
        }
        return massHouse;
    }

    //Список квартир, имеющий заданное число комнат
    public void flatsWithRooms(House[] house) {

        int userInput = getIntUserInput(1, 4,"amount rooms in flat");

        int id = 1;
        for (House y : house)
            if (y.getAmountRooms() == userInput) {
                System.out.println(id + "  " + y.toString());
            }
    }

    //Список квартир, имеющих заданное число комнат и расположенных на этаже в заданном промежутке
    public void flatsWithRoomsFromFloor(House[] house) {

        int userInput = getIntUserInput(1, 4, "amount of rooms in flat");

        int firstUserInput = getIntUserInput(1, 5, "first number of flats floor");
        int secondUserInput = getIntUserInput(firstUserInput, 5, "second number of flats floor");

        int id = 1;
        for (House y : house) {
            if (y.getAmountRooms() == userInput & (y.getFloorNumber() >= firstUserInput & y.getFloorNumber() <= secondUserInput)) {
                System.out.println(id + "  " + y.toString());
            }

        }
    }
}

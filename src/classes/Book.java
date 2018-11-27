package classes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Book {
    private String author;
    private String name;
    private int year;
    private int pages;

    public Book() {
    }

    public Book(String author, String name, int year, int pages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }

    //Метод, принимающий  Stirng с клавиатуры
    private String takeString(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter book's " + message + " - ");
        return scan.next();
    }

    //Метод, принимающий  Int с клавиатуры
    private int takeInt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter book's " + message + " - ");
        int userInput = 0;
        do {
            while (!scan.hasNextInt()) {
                if (scan.hasNextDouble()) {
                    System.out.print("The number is not an integer - ");
                } else {
                    System.out.print("That not a number! Try again - ");
                }
                scan.next();
            }
            userInput = scan.nextInt();
        } while (userInput < 0);
        return userInput;
    }

    public void setAuthor() {
        this.author = takeString("author");
    }

    public void setName() {
        this.name = takeString("name");
    }

    public void setYear() {
        this.year = takeInt("year");
    }

    public void setPages() {
        this.pages = takeInt("pages");
    }

    static void bookInformation(Book[] books) {
        Scanner scan = new Scanner(System.in);
        int id = 1;
        for (Book y : books) {
            System.out.println(id + " - " + y.getName());
            id++;
        }
        System.out.print("Make your choise - ");
        int userNum = 0;
        do {
            while (!scan.hasNextInt()) {
                if (scan.hasNextDouble()) {
                    System.out.print("The number is not an integer - ");
                } else {
                    System.out.print("That not a number! Try again - ");
                }
                scan.next();
            }
            userNum = scan.nextInt();
            if (userNum < 1) {
                System.out.print("Number less than 1. Try again - ");
            } else if (userNum > books.length) {
                System.out.print("Number greater than " + books.length + ". Try again - ");
            }

        } while (userNum < 1 | userNum > books.length);

        System.out.println(books [userNum - 1].toString());
    }
}

package classes;

public class TestClasses {
    public static void main(String[] args) {
//        punktFirst();
//        testStudent();
//        testPatient();
//        testAbiturient();
//        testHouse();
//        testCar();
//        testCircle();
//        testWareHouse();
//        testBook();
//        testFraction();
    }

    public static void punktFirst() {
        NamedEntity[] massNamedEntity = new NamedEntity[5];
        for (int i = 0; i < massNamedEntity.length; i++) {
            massNamedEntity[i] = new NamedEntity("NaEn" + i);
        }
        for (NamedEntity y : massNamedEntity) {
            System.out.println(y.toString());
        }
    }

    public static void testStudent() {

        Student testStudent = new Student();
        Student[] students = testStudent.getStudentsMass(50);

        testStudent.listFacultyStudents(students);
        testStudent.allStunentsOnEveryFaculty(students);
        testStudent.allStudentsOfCourse(students);
        testStudent.studentsAfterYear(students);
        testStudent.studentsFromGroup(students);
    }

    public static void testPatient() {

        Patient patient = new Patient();
        Patient[] patientsOfHospital = patient.makeMassPatients(50);

        patient.patientsWithDiagnosis(patientsOfHospital);
        patient.patientsWithNumMedicineCard(patientsOfHospital);
    }

    public static void testAbiturient() {
        Abiturient abiturient = new Abiturient();
        Abiturient[] massAbiturients = abiturient.makeMassAbiturient(50);

        abiturient.abiturientsWithBadMarks(massAbiturients);
        abiturient.abiturientWithHigherMiddleMark(massAbiturients);

        Abiturient[] massAbit = abiturient.makeMassAbiturient(20);
        abiturient.abiturientsWithHighestMark(massAbit);
    }

    public static void testHouse() {
        House house = new House();
        House[] houses = house.makeMassHouse(20);

        house.flatsWithRooms(houses);
        house.flatsWithRoomsFromFloor(houses);
    }

    public static void testCar() {
        Car car = new Car();
        Car[] masCars = car.makeMassCar(20);

        car.carsCertainBrand(masCars);
        car.carsCertainBrandWithYear(masCars);
        car.carsWithYearWithHigherPrice(masCars);
    }

    public static void testCircle() {
        Circle circle = new Circle(10, 5, 5);
        System.out.println(circle.toString());
        circle.changeCentre(-5, -5);
        System.out.println(circle.toString());
        circle.changeRadius(-15);
        System.out.println(circle.toString());
        circle.squareCircle();
        circle.lengthCircle();
    }

    public static void testWareHouse() {
        WareHouse wareHouse = new WareHouse(10, 5.6);
        System.out.println(wareHouse.toString());
        wareHouse.changeUnitCommodity(5);
        wareHouse.changeUnitCost(-0.6);
        System.out.println(wareHouse.toString());
        wareHouse.changeUnitCommodity(-20);
        wareHouse.changeUnitCost(-6);
        System.out.println(wareHouse.toString());
        wareHouse.costOfAllUnits();
        wareHouse.comparisonOfTheCost(30, 35);
    }

    public static void testBook() {
        Book book = new Book("Pushkin", "Onegin", 1985, 653);
        System.out.println(book.toString());
        book.setAuthor();
        book.setName();
        book.setYear();
        book.setPages();
        System.out.println(book.toString());

        Book[] masBooks = new Book[5];
        masBooks[0] = new Book("Булгаков", "Мастер и Маргарита", 1980, 1200);
        masBooks[1] = new Book("Чехов", "Палата №6", 1995, 568);
        masBooks[2] = new Book("Гоголь", "Метрвые души", 1990, 854);
        masBooks[3] = new Book("Шолохов", "Тихий Дон", 1984, 1562);
        masBooks[4] = new Book("Гоголь", "Ревизор", 1975, 385);
        Book.bookInformation(masBooks);
    }

    public static void testFraction() {
        Fraction workFraction = new Fraction();
        Fraction firstFract = new Fraction(3, 5);
        Fraction secondFract = new Fraction(2, 3);
        Fraction thirdFract = new Fraction(-4, 5);
        Fraction fourthFract = new Fraction(-4, 3);

        workFraction.sumFractions(firstFract, secondFract);
        workFraction.differenceFractions(firstFract, secondFract);
        workFraction.multiplicationFractions(firstFract, secondFract);
        workFraction.differenceFractions(firstFract, secondFract);
        System.out.println();
        workFraction.sumFractions(firstFract, thirdFract);
        workFraction.differenceFractions(firstFract, thirdFract);
        workFraction.multiplicationFractions(firstFract, thirdFract);
        workFraction.differenceFractions(firstFract, thirdFract);
        System.out.println();
        workFraction.sumFractions(firstFract, fourthFract);
        workFraction.differenceFractions(firstFract, fourthFract);
        workFraction.multiplicationFractions(firstFract, fourthFract);
        workFraction.differenceFractions(firstFract, fourthFract);

        workFraction.sumFractions(firstFract, secondFract, thirdFract, fourthFract);
        workFraction.multiplicationFractions(firstFract, secondFract, thirdFract, fourthFract);

        Fraction[] massFraction = new Fraction[6];
        for (int i = 0; i < massFraction.length; i++) {
            massFraction[i] = new Fraction(((int) (Math.random() * 9) + 1), ((int) (Math.random() * 9) + 1));
        }
        workFraction.changeElemMassive(massFraction);
    }
}


package classes;

public class Fraction {

    private int m;
    private int n;

    public Fraction() {
    }

    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    //Метод - Сумма двух дробей
    public void sumFractions(Fraction firstFraction, Fraction secondFraction) {
        int sumM = 0;
        int sumN = 0;

        if (firstFraction.getN() == secondFraction.getN()) {
            sumM = firstFraction.getM() + secondFraction.getM();
            sumN = firstFraction.getN();
        } else {
            sumM = firstFraction.getM() * secondFraction.getN() + secondFraction.getM() * firstFraction.getN();
            sumN = firstFraction.getN() * secondFraction.getN();
        }
        System.out.println("Сумма дробей " + firstFraction.getM() + "/" + firstFraction.getN() + " и " +
                secondFraction.getM() + "/" + secondFraction.getN() + " составляет - " + sumM + "/" + sumN);
    }

    // Метод - Сумма двух дробей, возвращает новую дробь после сложения
    public Fraction returnSumFractions(Fraction firstFraction, Fraction secondFraction) {
        int sumM = 0;
        int sumN = 0;

        if (firstFraction.getN() == secondFraction.getN()) {
            sumM = firstFraction.getM() + secondFraction.getM();
            sumN = firstFraction.getN();
        } else {
            sumM = firstFraction.getM() * secondFraction.getN() + secondFraction.getM() * firstFraction.getN();
            sumN = firstFraction.getN() * secondFraction.getN();
        }
        Fraction returnFraction = new Fraction(sumM,sumN);
        return returnFraction;
    }

    // Метод - Сумма переменного количества дробей, возвращает новую дробь после сложения
    public Fraction sumFractions(Fraction... v) {
        int sumM = 0;
        int sumN = 1;

        for (int i = 0; i < v.length; i++) {
            sumN *= v[i].getN();
        }

        for (int i = 0; i < v.length; i++) {
            sumM += v[i].getM() * (sumN / v[i].getN());

        }

        Fraction newFraction = new Fraction(sumM, sumN);
        newFraction.reductionFraction(newFraction);
        return newFraction;
    }

    //Метод - Разность двух дробей
    public void differenceFractions(Fraction firstFraction, Fraction secondFraction) {
        int differenceM = 0;
        int differenceN = 0;

        if (firstFraction.getN() == secondFraction.getN()) {
            differenceM = firstFraction.getM() - secondFraction.getM();
            differenceN = firstFraction.getN();
        } else {
            differenceM = firstFraction.getM() * secondFraction.getN() - secondFraction.getM() * firstFraction.getN();
            differenceN = firstFraction.getN() * secondFraction.getN();
        }
        System.out.println("Разность дробей " + firstFraction.getM() + "/" + firstFraction.getN() + " и " +
                secondFraction.getM() + "/" + secondFraction.getN() + " составляет - " + differenceM + "/" + differenceN);
    }

    //Метод - Умножение двух дробей
    public void multiplicationFractions(Fraction firstFraction, Fraction secondFraction) {
        int multiplicationM = 0;
        int multiplicationN = 0;

        multiplicationM = firstFraction.getM() * secondFraction.getM();
        multiplicationN = firstFraction.getN() * secondFraction.getN();

        System.out.println("Умножение дробей " + firstFraction.getM() + "/" + firstFraction.getN() + " и " +
                secondFraction.getM() + "/" + secondFraction.getN() + " составляет - " + multiplicationM + "/" + multiplicationN);
    }

    //Метод - Умножение переменного количества дробей, возвращает новую дробь после сложения
    public Fraction multiplicationFractions(Fraction... v) {
        int multiplicationM = 1;
        int multiplicationN = 1;

        for (int i =0; i < v.length; i++){
            multiplicationM *= v[i].getM();
            multiplicationN *= v[i].getN();
        }

        Fraction newFraction = new Fraction(multiplicationM, multiplicationN);
        newFraction.reductionFraction(newFraction);
        return newFraction;
    }

    //Метод - Деление двух дробей
    public void divisionFractions(Fraction firstFraction, Fraction secondFraction) {
        int divisionM = 0;
        int divisionN = 0;

        divisionM = firstFraction.getM() * secondFraction.getN();
        divisionN = firstFraction.getN() * secondFraction.getM();

        System.out.println("Деление дробей " + firstFraction.getM() + "/" + firstFraction.getN() + " и " +
                secondFraction.getM() + "/" + secondFraction.getN() + " составляет - " + divisionM + "/" + divisionN);
    }

    //Метод - сокращение заданной дроби
    public void reductionFraction(Fraction fraction) {
        int GCD = 1;
        int firstNum = fraction.m, secondNum = fraction.n;
        int remainder = firstNum;

        if (Math.abs(firstNum) < Math.abs(secondNum)) {
            firstNum = secondNum;
            secondNum = remainder;
        }

        while (remainder != 0) {
            remainder = firstNum % secondNum;
            firstNum = secondNum;
            if (remainder == 0) {
                GCD = Math.abs(secondNum);
            }
            secondNum = remainder;
        }

        if (GCD != 1) {
            m /= GCD;
            n /= GCD;
        }
    }

    //Метод - Изменяет каждый элемент массива с четным индексом путем добавления следующего за ним элемента
    public void changeElemMassive (Fraction[] mass){

        for (int indexNum = 0; indexNum < mass.length; indexNum +=2){
            mass [indexNum] =  mass [indexNum].returnSumFractions(mass [indexNum], mass [indexNum+1]);
        }
    }
}

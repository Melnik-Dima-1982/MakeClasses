package classes;

public class Circle {
    private double radius;
    private double centreX;
    private double centreY;

    public Circle() {
    }

    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Радиус не может быть меньше 0. Значение не установленою");
        } else {
            this.radius = radius;
        }
    }

    public Circle(double centreX, double centreY) {
        this.centreX = centreX;
        this.centreY = centreY;
    }

    public Circle(double radius, double centreX, double centreY) {
        if (radius <= 0) {
            System.out.println("Радиус не может быть меньше 0. Значение не установленою");
        } else {
            this.radius = radius;
            this.centreX = centreX;
            this.centreY = centreY;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Радиус не может быть меньше 0. Значение по умолчанию - " + this.radius);
        } else {
            this.radius = radius;
        }
    }

    public double getCentreX() {
        return centreX;
    }

    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }

    public double getCentreY() {
        return centreY;
    }

    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centreX=" + centreX +
                ", centreY=" + centreY +
                '}';
    }

    public void changeCentre(double changeX, double changeY) {
        centreX += changeX;
        centreY += changeY;
    }

    public void changeRadius(double changeRadius) {
        if (changeRadius < 0 & Math.abs(changeRadius) > radius) {
            System.out.println("Недопустимое изменеие радиуса. Значение не изменено");
        } else {
            radius += changeRadius;
        }

    }

    public void squareCircle() {
        System.out.println("Square of circle - " + Math.PI * Math.pow(radius, 2));
    }

    //Дополнительный метод для возврата только значения пощади
    public double squareCircle(int formatNum) {
        return Math.PI * Math.pow(radius, 2);
    }

    public void lengthCircle() {
        System.out.println("Длина окружности составит - " + 2 * Math.PI * radius);
    }

}

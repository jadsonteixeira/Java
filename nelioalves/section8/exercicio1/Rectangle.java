package nelioalves.section8.exercicio1;

public class Rectangle {
    public double width;
    public double heigth;

    public double area() {
        return width * heigth;
    }

    public double perimeter() {
        return 2 * (width + heigth);
    }

    public double diagonal() {
        double diagonal;
        return Math.sqrt((width * width) + (heigth * heigth));
    }

    public String toString() {
        return "AREA = " + String.format("%.2f", area()) + "\n"
                + "PERIMETER = " + String.format("%.2f", perimeter()) + "\n"
                + "DIAGONAL = " + String.format("%.2f", diagonal());
    }
}

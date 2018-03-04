package assignment1;

/**
 * Created by KayLee on 01/03/2018.
 */
public class Triangle {
    private boolean rightTriangle;
    private double a;
    private double b;
    private double c;

    public boolean isRightTriangle() {
        if((Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))))
            rightTriangle = true;
        return rightTriangle;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getBgivenAC(double a, double c){
        this.c = c;
        this.a = a;

        return Math.sqrt((Math.pow(c, 2) - (Math.pow(a, 2))));
    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

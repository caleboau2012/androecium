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

    public Triangle(){

    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.getBgivenAC(48, 80));
        System.out.println(t.getBgivenAC(84, 91));

        t = new Triangle(45, 55, 75);
        System.out.println(t.isRightTriangle());

        t = new Triangle(28, 45, 53);
        System.out.println(t.isRightTriangle());
    }
}

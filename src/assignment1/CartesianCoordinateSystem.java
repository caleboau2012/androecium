package assignment1;

import java.util.Scanner;

/**
 * Created by KayLee on 01/03/2018.
 */
public class CartesianCoordinateSystem {
    public double calculateDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("X1: ");
        double x1 = input.nextDouble();

        System.out.println("Y1: ");
        double y1 = input.nextDouble();

        System.out.println("X2: ");
        double x2 = input.nextDouble();

        System.out.println("Y2: ");
        double y2 = input.nextDouble();

        CartesianCoordinateSystem app = new CartesianCoordinateSystem();
        System.out.println(app.calculateDistance(x1, y1, x2, y2));
    }
}

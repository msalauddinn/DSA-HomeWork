package Conditionals;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of a rectangle : ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of a rectangle : ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        if (area == perimeter) System.out.println("Area and Perimeter are equal");
        else System.out.println("Area and Perimeter are not equal");
    }
}

package Conditionals;

import java.util.Scanner;

public class PositionOfTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two points : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0){
            if (y > 0)
                System.out.println("(" + x + ", " + y + ") lies on 1st Quadrant");
            else if (y == 0)
                System.out.println("(" + x + ", " + y + ") lies on x-axis");
            else
                System.out.println("(" + x + ", " + y + ") lies on 4th Quadrant");
        }
        else if (x == 0){
            if (y != 0)
                System.out.println("(" + x + ", " + y + ") lies on y-axis");
            else
                System.out.println("(" + x + ", " + y + ") lies on Origin");
        }
        else {
            if (y != 0){
                if (y > 0)
                    System.out.println("(" + x + ", " + y + ") lies on 2nd Quadrant");
                else
                    System.out.println("(" + x + ", " + y + ") lies on 3rd Quadrant");
            }
            else
                System.out.println("(" + x + ", " + y + ") lies on x-axis");
        }
    }
}

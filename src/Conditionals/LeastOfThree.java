package Conditionals;

import java.util.Scanner;

public class LeastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        int num1, num2, num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 <= num2){
            if (num1 <= num3)
                System.out.println(num1 + " is least number among these three");
            else
                System.out.println(num3 + " is least number among these three");
        }
        else {
            if (num2 <= num3)
                System.out.println(num2 + " is least number among these three");
            else
                System.out.println(num3 + " is least number among these three");
        }
    }
}

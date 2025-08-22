package Conditionals;

import java.util.Scanner;

public class SmallerThan69OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num < 69 && num > -69){
            System.out.println("Smaller than 69");
        }
        else System.out.println("Not smaller than 69");
    }
}

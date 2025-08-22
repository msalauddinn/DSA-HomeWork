package Loops.ForLoops;

public class SmallCaseUpperCase {
    public static void main(String[] args) {
        for (int i = 97; i <= 122; i++){
            char upper = (char)(i - 32);
            System.out.println((char)i + " --> " + upper);
        }
    }
}
package Inputs;
import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        System.out.println("Inputs in java");
//        If you want take input from the user make sure import the scanner class
        Scanner sc = new Scanner(System.in);

//      for bytes
        byte extraMiniNUm = sc.nextByte();

//      for bytes
        short MiniNum = sc.nextShort();

//      for int
        int Num = sc.nextInt();

//      for long
        long dinoNum = sc.nextLong();

//      for float
        float floatingPoint = sc.nextFloat();

//      for double
        double doubleValue = sc.nextDouble();
//      for first single word it only peaks the word before space
        String fName = sc.next();
//      for Whole Input Like Paragraph
        String fullName = sc.nextLine();
    }
}

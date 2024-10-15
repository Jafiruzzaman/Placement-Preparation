package patternProblem;

import java.util.Scanner;

public class __13_patternProblem {
    public static void main(String[] args) {
        System.out.println("convert binary to decimal");
        System.out.println("Enter The binary Number");
        Scanner scanner = new Scanner(System.in);
        int binaryNumber = scanner.nextInt();
        int pow = 1;
        int ans=0;
        while (binaryNumber>0){
            int unitDigit = binaryNumber%10;
            ans+=(unitDigit*pow);
            pow*=2;
            binaryNumber/=10;
        }
        System.out.println("Enter the result "+ans);

    }
}

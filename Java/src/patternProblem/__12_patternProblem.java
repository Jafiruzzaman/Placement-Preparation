package patternProblem;

import java.util.Scanner;

public class __12_patternProblem {
    public static void main(String[] args) {
        System.out.println("Roteted Numerical rectangular pattern");
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i<=n;i++){
//
            for (int j=i;j<=n;j++){
                System.out.print(j+" ");
            }

//          print repeated number
            for (int k =1;k<=(i-1);k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}

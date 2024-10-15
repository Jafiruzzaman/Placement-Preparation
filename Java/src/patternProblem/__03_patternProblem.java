package patternProblem;

public class __03_patternProblem {
    public static void main(String[] args) {
        System.out.println("print triangle");
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

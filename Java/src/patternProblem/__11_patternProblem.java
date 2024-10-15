package patternProblem;

public class __11_patternProblem {
    public static void main(String[] args) {
        System.out.println("print a pyramid");
        int row = 6;
        for (int i = 0;i<row;i++){
            for (int j =i;j<row;j++){
                System.out.print(" ");
            }
            for (int j = 0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package patternProblem;

public class __02_patternProblem {
    public static void main(String[] args) {
        System.out.println("print a hollo rectangular");
        int row = 5;
        int col = 5;
        for(int i = 1;i<=row;i++){
            for(int j=1;j<=col;j++){

                if (i==1 | j==1 | i==row | j==col){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

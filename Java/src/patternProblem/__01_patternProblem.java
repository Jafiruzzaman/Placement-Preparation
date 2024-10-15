package patternProblem;

//    __01_patternProblem
public class __01_patternProblem {
    public static void main(String[] args) {
        System.out.println("print a rectangular star");
        int row = 5;
        int col = 5;
        for (int i =0;i<row;i++){
            for(int j= 0;j<col;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

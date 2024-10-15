package patternProblem;

public class __04_patternProblem {
    public static void main(String[] args) {
        System.out.println("print inverted triangle");
        int row = 5;
        for(int i = row;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

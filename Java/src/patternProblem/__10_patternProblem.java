package patternProblem;

public class __10_patternProblem {
    public static void main(String[] args) {
        System.out.println("Find a raise to the power b");
        int a = 2;
        int b = 5;
        int result = 1;
        for(int i = 1;i<=b;i++){
            result = result*a;
        }
        System.out.println("the 2 raise to the power of 5 is "+result);
    }
}

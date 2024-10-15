package patternProblem;

public class __09_patternProblem {
    public static void main(String[] args) {
        System.out.println("find the factorial of the given number");
        int num = 5;
        int fact = 1;
        for (int i = 1;i<=num;i++){
            fact*=i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
    }
}

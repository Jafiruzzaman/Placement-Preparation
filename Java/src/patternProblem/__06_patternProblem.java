package patternProblem;

public class __06_patternProblem {
    public static void main(String[] args) {
        System.out.println("Count the number of digit's for given number");
        int num = 1785; // output will be 4
        int count = 0;
        while (num>0){
            int lastDigit = num%10;
            count++;
            num/=10;
        }
        System.out.println("The digit count of the number is "+count);
    }
}

package patternProblem;

public class __05_patternProblem {
    public static void main(String[] args) {
        System.out.println("find the sum of digit's for given number");
        int num = 1785; // output --> 1+7+8+5 = 21
        int result = 0;
        while(num>0){
//            get the last digit from num
            int lastDigit = num%10;
            result+=lastDigit;
            num/=10;
        }
        System.out.println("The result is "+result);
    }
}

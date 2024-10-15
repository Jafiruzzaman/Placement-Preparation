package patternProblem;

public class __07_patternProblem {
    public static void main(String[] args) {
        System.out.println("reverse the digit of a number");
        int num = 1785; // output --> 5871
        int answer = 0;
        while(num>0){
            int lastDigit = num%10;
            answer  = (answer *10)+lastDigit ;
            num/=10;
        }
        System.out.println("The reverse number is "+answer);
    }
}

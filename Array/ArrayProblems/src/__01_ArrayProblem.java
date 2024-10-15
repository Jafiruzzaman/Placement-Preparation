import java.util.Scanner;

public class __01_ArrayProblem {
    public static int sum (int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("find the sum for the given array");
        System.out.println("Enter the size of an array ");
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("Enter the elements");
            arr[i] = scanner.nextInt();
        }
        int result = sum(arr);
        System.out.println("The result is "+result);
        scanner.close();
    }
}

import java.util.Scanner;

public class __02_ArrayProblem {
    public static int MaxValue(int[] arr){
        int n = arr.length;
        int maxVal = 0;
        for (int i =0;i< n;i++){
            for (int j = 0; j < n-1; j++) {
                if (arr[j]>arr[j+1]){
                    maxVal = arr[j];
                }
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        System.out.println("find the maximum value of an array");
        System.out.println("Enter Size of an array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value ");
            arr[i] = scanner.nextInt();
        }
        int result = MaxValue(arr);
        System.out.println("The result is "+result);
    }
}

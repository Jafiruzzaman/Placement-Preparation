import java.util.Scanner;

public class __03_ArrayProblem {
    public static  int FindIndex(int[] arr,int x){
        int size = arr.length;
        int index =0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[j]==x){
                    index = j;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println("Find the index");

        System.out.println("Enter the Size of the Index");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            System.out.println("Enter the number");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target value");
        int target = sc.nextInt();
        int result = FindIndex(arr,target);
        System.out.println("The result is "+result);
    }
}

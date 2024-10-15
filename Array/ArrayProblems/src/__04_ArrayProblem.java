import java.util.*;
public class __04_ArrayProblem {
//    create a method for counting the number of occurrences
    public static int countOccurrences(int[] array,int index){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Count Occurrences");
        System.out.println("enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the target number");
        int target = scanner.nextInt();
        int result = countOccurrences(array,target);
        System.out.println("the target Occurrences is "+result);
        scanner.close();
    }
}

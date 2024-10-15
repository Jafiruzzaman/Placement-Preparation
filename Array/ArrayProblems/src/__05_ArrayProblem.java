import java.util.*;
public class __05_ArrayProblem {
  public static int lastOccurrence(int[] arr, int target) {
    int lastIndex = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == target) {
        lastIndex = i;
        break;
      }
    }
    return lastIndex;
  }
  public static void main(String[] args) {
    System.out.println("Find the last occurrence of an array");
    System.out.println("Enter the Size of the array");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.print("Enter the value ");
      arr[i] = scanner.nextInt();
    }
    System.out.println("Enter the target value");
    int target = scanner.nextInt();
    int result = lastOccurrence(arr, target);
    System.out.println("The last occurrence "+result);
    if (result == -1) {
      System.out.println("The target value is not found");
    }
    scanner.close();
  }
  
}

public class TraversingArray {
    public static void main(String[] args) {
        System.out.println("Traversing an array");
//        to check the length of an array
        int[] arr = {11,2,5,4,8,75,66,48,85,41};
        System.out.println(arr.length);
//        there are 3 types of loop for traversing an array
//        1. for loop
            for (int i = 0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        System.out.println();
//        2. for-each loop
            for(int i:arr){
                System.out.print(i+" ");
            }
        System.out.println();
//        3. while loop
        int i = 0;
        while (i< arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}

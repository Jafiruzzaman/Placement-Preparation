public class BasicArray {
    public static void main(String[] args) {
        System.out.println("basic array");
//        create an array
        int[] arr = new int[5];
//        assign values
        arr[0] = 15;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 5;
        arr[4] = 54;
        System.out.println(arr); //  when you want to print the array, it will give you the address of a memory location.
//        to print an array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

//        another way of creating an array
        int[] brr = {20,1,5,4,8,8};
        System.out.println(brr[4]);
    }
}

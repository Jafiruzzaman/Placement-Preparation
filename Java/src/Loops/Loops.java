package Loops;

public class Loops {
    public static void main(String[] args) {
        System.out.println("All About Loops");
        /*
        There are 2 types of loops in java
        1. For loop
        Syntax of for loop

        for(initialization,conditions,updation){
            // code
        }
        2. While loop
        initialization
        while(condition){
            // code
        }
        3. Do-while loop


        initialization
        do{
            code
            updation
        }while(conditions)
         */
//      for loop
        for (int i =0;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("print by while loop");
//        while loop
        int i = 0;
        while (i<=10){
            System.out.print(i+" ");
//            if you don't update i values, it will be an infinite loop
            i++;
        }
//      do while loop
//      NOTE: do-while loop run at-least one time if the condition is false
        i = 12;
        System.out.println();
        do{
            System.out.print(i+" ");
            i++;
        }
        while (i<=10);
    }
}

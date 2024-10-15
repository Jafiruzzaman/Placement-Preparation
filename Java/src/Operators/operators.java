package Operators;

public class operators {
    public static void main(String[] args) {
        System.out.println("operators in java");
        /*
        There are 6 types of Operators in java
        1. Assignment Operators.
        2. Arithmetic Operators.
        3. Relational Operators.
        4. Logical Operators.
        5. Bitwise Operators.
        6. Unary Operators.
         */
//        1. Assignment Operators.
//        equals to (=)
        int a = 10;
        int b = 5;
//        plus equals to (+=)
        a+=10;
//        minus equals to (-=)
        a-=10;
//        multiply equals to (*=)
        a*=10;
//        divide equals to (/=)
        a/=10;
//        modulo equals to (%=)
        a%=10;

//        2. Arithmetic Operators.
        int c = 10;
        int d = 5;
//      Note: Plus and Minus are Unary Operator Also

//      plus operator(+)
        System.out.println("the sum of 10 + 5 is "+(c+d));

//      Minus operator(+)
        System.out.println("the sum of 10 - 5 is "+(c-d));

//      multiply operator(*)
        System.out.println("the sum of 10 * 5 is "+(c*d));

//      divide operator(+)
        System.out.println("the sum of 10 / 5 is "+(c/d));
//      modulo operator(%)

        System.out.println("the sum of 10 % 5 is "+(c%d));

//      3. Relational Operators.

//      greater than (>)
        System.out.println("10 > 5 is it "+(c>d));

//      greater than or equals  (>=)
        System.out.println("10 > 5 is it "+(c>d));

//      less than (<)
        System.out.println("10 < 5 is it "+(c<d));

//      less than or equals (<=)
        System.out.println("10 <= 5 is it "+(c<=d));

//      less than or equals (==)
        System.out.println("10 == 5 is it "+(c==d));

//      less than or equals (!=)
        System.out.println("10 > 5 is it "+(c!=d));


//        4. Logical Operators.
//        Logical And (&&)
        System.out.println("10 > 5 and 10 != 5 is it "+((10 > 5) && (10 != 5)));

//        Logical Or (||)
        System.out.println("10 > 5 or 10 != 5 is it "+((10 > 5) || (10 != 5)));

//        Logical Not (!)
        System.out.println("it convert true to "+(!true));
//        5. Bitwise Operators.
//        Bitwise And (&)
        System.out.println(10 & 5); // it converts decimal to binary and compare if both numbers are 1 in binary then it returns only 1

//        bitwise Or (|)
        System.out.println(10 | 5); // it converts decimal to binary and compare if only one number are 1 in binary then it returns only 1

//        Bitwise Not (~)
        System.out.println(~5); // it converts decimal to binary and check if find 0 then replace with 1 and 1 to 0 in binary then it returns the result in decimal
//        Left Shift (<<)
        System.out.println("2 << 1 the result is "+(2<<1)); // if you use left shift one time it means (prev number multiply (left shift number))
//                                                                                               2 << 1 (2*1) = 2
//                                                                                               2 << 2 (2*2) = 4 // it means multiply
//                                                                                               4 << 3 (4*2) = 8
//                                                                                               2 << 4 (8*2) = 16
//        Right Shift (>>)
        System.out.println("2 >> 1 the result is "+(16>>4)); // if you use right shift one time it means (prev number divide (right shift number))
//                                                                                               16 >> 1 (16/2) = 2
//                                                                                               16 >> 2 (8/2) = 4 // it means divide
//                                                                                               16 >> 3 (4/2) = 2
//                                                                                               16 >> 4 (2/2) = 1
//        6. Unary Operators.
        //      plus operator(+)
        System.out.println("the sum of 10 + 5 is "+(c+d));

//      Minus operator(-)

        System.out.println("the sum of 10 - 5 is "+(c-d));

//      increment Operator

//      prefix increment Operators
        System.out.println("prefix increment of a "+(++a));

//      Postfix increment Operators
        System.out.println("prefix increment of a "+(a++));

//      prefix decrement Operators
        System.out.println("prefix increment of a "+(--a));

//      Postfix decrement Operators
        System.out.println("prefix increment of a "+(a--));
//        now a's value must be 0 because of postfix decrement
        System.out.println("now a's value must be "+a +" because of postfix decrement ");
    }
}

package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("All About Conditionals");
/*        if you want to render something on a condition-basis, then you have to use conditionals in java.
        1. if-else statement
        2. switch-case statement

        */
//        1. if-else statement
        int UserAge = 18;
        if (UserAge>=18){
            System.out.println("You can can access the website");
        }else {
            System.out.println("You can't access the website");
        }
//        2. switch-case statement
        String day = "Saturday";
//        switch (day){
//            case "Saturday":
//                System.out.println("The day is "+day);
//            case "Sunday":
//                System.out.println("The day is "+day);
//            case "Monday":
//                System.out.println("The day is "+day);   // all statement will be executed
//            case "Tuesday":
//                System.out.println("The day is "+day);
//            case "Wednesday":
//                System.out.println("The day is "+day);
//            case "Thursday":
//                System.out.println("The day is "+day);
//            case "Friday":
//                System.out.println("The day is "+day);
//            default:
//                System.out.println("The day is not valid");
//

                switch (day){
                    case "Saturday", "Thursday", "Wednesday", "Tuesday", "Friday", "Monday", "Sunday":
                        System.out.println("The day is "+day);
                        break;
                    default:
                        System.out.println("The day is not valid");
        }
    }
}

import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        System.out.println("String Builder");

//      create String using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
//      SetCharAt
        stringBuilder.setCharAt(0,'T');
        System.out.println(stringBuilder);

//      insert
        stringBuilder.insert(1,"i");
        System.out.println(stringBuilder);

//      deleteCharAt
        stringBuilder.deleteCharAt(3);
        System.out.println(stringBuilder);

//      reverse
        System.out.println(stringBuilder.reverse());

//      delete
        stringBuilder.delete(2,4);
        System.out.println(stringBuilder);
    }
}

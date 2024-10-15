public class StringMethod {

        public static void main(String[] args) {
            System.out.println("strings methods");
            //
            String str = "Tuhin ahamed     ";

            // toUpperCase
            String upperCase = str.toUpperCase();
            System.out.println(upperCase);

            // toUpperCase
            String lowerCase = str.toLowerCase();
            System.out.println(lowerCase);

            // toUpperCase
            String addTwoString = str.concat(" is me");
            System.out.println(addTwoString);

            // toUpperCase
            char findIndexString = str.charAt(0);
            System.out.println(findIndexString);

            // toUpperCase
            String replaceChar = str.replace('T','d');
            System.out.println(replaceChar);

            // toUpperCase
            String SubStrings = str.substring(0,5);
            System.out.println(SubStrings);

            // toUpperCase
            Boolean EndsWiths = str.endsWith("un");
            System.out.println(EndsWiths);

            // trim it moves the white spaces
            String trims = str.trim();
            System.out.println(trims);

//          contains only return true if any character is present
            Boolean contains = str.contains("i");
            System.out.println("contains "+contains);

//           isEmpty methods only return true if the string is empty.
            str= "";
            Boolean empty = str.isEmpty();
            System.out.println("The String is Empty or Not "+empty);

//          valuesOf

//          String str2 = "Toma Khanom";
            System.out.println(str);
            String str2 = "";

            Boolean isEqual = str.equals(trims);
            System.out.println(isEqual);

            Boolean EqualsIgnoreCase = str2.equalsIgnoreCase(trims);
            System.out.println("Equal case ignore "+EqualsIgnoreCase);
//          compare
            str = "tuhin ahamed";
            int compare = str.compareTo(str2);
            System.out.println(compare);
//            compareIgnoreCase
            int compareIoIgnore = str.compareToIgnoreCase(str2);
            System.out.println("compare to ignore "+compareIoIgnore);

        }


}

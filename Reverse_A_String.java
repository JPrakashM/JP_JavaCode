public class Reverse_A_String {
    public static void main(String arg[]) {
        // if we are providing StringBuilder or StringBuffer then we can use reverse() method, reference the bellow examples
        String original = "Hello World";
        String reversed1 = reverseWithStringBuilder(original);
        String reversed2 = reverseWithStringBuffer(original);
        System.out.println("Reversed String with StringBuilder: " + reversed1);
        System.out.println("Reversed String with StringBuffer: " + reversed2);

        //If we are trying without reverse method then we can resolve in 2 different way.
        String str = "Hello world";
        System.out.println(reverse(str));

        String str1 = "Hello world";
        System.out.println(reverseWithCharArray(str1));

        String str2 = "Hello world";
        System.out.println(reverseWithRecursion(str2));
    }

    public static String reverseWithRecursion(String str) {
        System.out.println(str);
        if (str.isEmpty())
            return str;
        return reverseWithRecursion(str.substring(1)) + str.charAt(0);

       /* if (str.isEmpty())
            return reversedString;
        reversedString = str.charAt(0) + reversedString;
        return reverseWithRecursion(str.substring(1));*/
    }

    public static String reverseWithCharArray(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
    public static String reverse(String inputString) {
        if (inputString == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = inputString.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }


    public static String reverseWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseWithStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}

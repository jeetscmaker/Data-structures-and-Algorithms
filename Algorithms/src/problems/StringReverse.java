package problems;

public class StringReverse {
    public static void main(String[] args) {
        String input = "abcde";
        System.out.println("The reversed string using reverse() is: " + reverse(input));
        System.out.println("The reversed string using reverse2() is: " + reverse2(input));
        System.out.println("The reversed string using reverse3() is: " + reverse3(input));
    }

    // Using recursion.
    private static String reverse(String input) {
        if (input.length() == 0)
            return "";
        else
            return input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
    }

    // Using StringBuilder.
    public static String reverse2(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    // Using normal logic
    public static String reverse3(String input){
        String reversed = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }
}

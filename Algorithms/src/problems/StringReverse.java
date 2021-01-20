package problems;

public class StringReverse {
    public static void main(String[] args) {
        String input = "abcde";
        System.out.println("The reversed string is: " + reverse(input));
    }

    // Using recursion.
    private static String reverse(String input) {
        if (input == "")
            return "";
        else if(input.length() == 1)
            return String.valueOf(input.charAt(0));
        else
            return input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
    }
}

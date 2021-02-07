package problems;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Input: aaaabbbcca
 * Output: [("a",4), ("b",3), ("c",2), ("a",1)]
 * */

public class CharsCounter {
    public static void main(String[] args) {
        String input = "aaaabbbcca";
        method1(input);
        method2(input);
    }

    private static void method1(String input){
        Pattern r =  Pattern.compile("(.)\\1*");
        Matcher m = r.matcher(input);

        var finalResult = m.results()
                .map(match -> match.group())
                .map(s -> Map.of(String.valueOf(s.charAt(0)), s.length()))
                .collect(Collectors.toList());
        System.out.println(finalResult);
    }

    private static void method2(String input){
        List<String> list = new ArrayList<>();
        int count = 1, startIndex = 0, n = input.length();
        for (int i = 0; i < n - 1; i++) {
            if (input.charAt(i) == input.charAt(i+1))
                count++;
            else{
                list.add("(\"" + String.valueOf(input.charAt(startIndex)) + "\"," + count + ")");
                startIndex = i+1;
                count = 1;
                if (i+1 == n-1){
                    list.add("(\"" + String.valueOf(input.charAt(startIndex)) + "\"," + count + ")");
                }
            }
        }
        System.out.println(list);
    }
}

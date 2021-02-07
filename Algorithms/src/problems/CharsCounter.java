package problems;

import java.util.Map;
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
    }

    static void method1(String input){
        Pattern r =  Pattern.compile("(.)\\1*");
        Matcher m = r.matcher(input);

        var finalResult = m.results()
                .map(match -> match.group())
                .map(s -> Map.of(String.valueOf(s.charAt(0)), s.length()))
                .collect(Collectors.toList());
        System.out.println(finalResult);
    }

    static void method2(){

    }
}

package codeforces;

import java.util.HashMap;
import java.util.Scanner;

/**
 * A word or a sentence in some language is called a pangram if all the characters of the alphabet of this language
 * appear in it at least once. Pangrams are often used to demonstrate fonts in printing or test the output devices.
 * <p>
 * You are given a string consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram.
 * We say that the string contains a letter of the Latin alphabet if this letter occurs in the string in
 * uppercase or lowercase.
 * Input
 * <p>
 * The first line contains a single integer n (1≤n≤100) — the number of characters in the string.
 * <p>
 * The second line contains the string. The string consists only of uppercase and lowercase Latin letters.
 * Output
 * <p>
 * Output "YES", if the string is a pangram and "NO" otherwise.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        n = sc.nextInt();
        s = sc.next();
        if (n < 26) {
            System.out.println("NO");
            return;
        }
        HashMap<Character, Short> map = new HashMap<>();
        int a = 97;
        while (a < 123) {
            map.put((char) a, (short) 0);
            ++a;
        }
        for (char c : s.toLowerCase().toCharArray()) {
            map.put(c, (short) (map.get(c) + 1));
        }
        boolean containsAllAlphabets = true;
        for (char c : map.keySet()) {
            if (map.get(c) == 0) {
                containsAllAlphabets = false;
                break;
            }
        }
        if (containsAllAlphabets)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}

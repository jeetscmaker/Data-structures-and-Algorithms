package codeforces;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author jeetscmaker
 * contest: Codeforces Round #666 (Div. 2), problem: (A) Juggling Letters
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        for (byte b = 1; b <= t; b++) {
            HashMap<Character, Integer> map = new HashMap<>(26);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String s;
                s = sc.next();
                for (char c : s.toCharArray()) {
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
            boolean isPossible = true;
            for (int i : map.values()) {
                if (i % n != 0) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) System.out.println("YES");
            else System.out.println("NO");
            map.clear();
        }
        sc.close();
    }
}


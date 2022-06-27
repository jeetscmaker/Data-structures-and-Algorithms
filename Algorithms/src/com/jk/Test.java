package com.jk;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            int numWords = input.nextInt();
            String[] words = new String[numWords];
            for (int j = 0; j < numWords; j++) {
                words[j] = input.next();
            }
            String password = input.next();

            noSolution = new HashSet<String>();

            String result = helper(password, words, "");

            if (!result.equals("WRONG PASSWORD")) {
                result = result.substring(1);
            }

            System.out.println(result);
        }
    }

    public static Set<String> noSolution;

    public static String helper(String password, String[] words, String curRes) {
        if (password.equals("")) {
            return curRes;
        } else if (noSolution.contains(password)) {
            return "WRONG PASSWORD";
        }

        for (int i = 0; i < words.length; i++) {
            if (password.indexOf(words[i]) == 0) {
                String append = curRes + " " + words[i];
                String res = helper(password.substring(words[i].length()), words, append);

                if (!res.equals("WRONG PASSWORD")) {
                    return res;
                }
            }
        }

        noSolution.add(password);

        return "WRONG PASSWORD";
    }
}

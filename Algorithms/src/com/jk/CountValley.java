package com.jk;

public class CountValley {
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int steps = 8;
        System.out.println("No of valleys traversed: " + countingValleys(steps, path));
    }

    public static int countingValleys(int steps, String path) {
        int ups = 0;     // # of valleys
        int level = 0;   // current level
        for (char c : path.toCharArray()) {
            if (c == 'U')
                ++level;
            if (c == 'D')
                --level;

            // if we just came UP to sea level
            if (level == 0 && c == 'U')
                ++ups;
        }
        return ups;
    }
}

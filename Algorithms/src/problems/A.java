package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) {
        String in = "abc";
        System.out.println("Reverse of " + in + " is: " + reverse(in));

        Boy b1 = new Boy(23, "Ramesh");
        Boy b2 = new Boy(11, "John");
        Boy b3 = new Boy(5, "Sia");
        Boy b4 = new Boy(14, "Robert");
        Boy b5 = new Boy(10, "Jane");
        Boy b6 = new Boy(45, "Christ");
        Boy b7 = new Boy(9, "Daniel");

        List<Boy> boyList = new ArrayList<>();
        boyList.add(b1);
        boyList.add(b2);
        boyList.add(b3);
        boyList.add(b4);
        boyList.add(b5);
        boyList.add(b6);
        boyList.add(b7);
        System.out.println("Printing all the names for which Id is less than 15: >>>>>>>>");
        List<String> namesList = boyList.stream()
                .filter(b -> b.getId() < 15)
                .map(Boy::getName)
                .collect(Collectors.toList());
        namesList.forEach(System.out::println);

        // Input: [10, 3, 7, 9, 6, 1, 8]
        // print elements having at least 2 numbers greater than them.
        // Output: 3, 7, 6, 1, 8
        // Find the largest number and the second largest number in the array
        // remaining elements will be the desired set of numbers.
        int[] x = {10, 3, 7, 9, 6, 1, 8};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; ++i) {
            if (first < x[i]) {
                second = first;
                first = x[i];
            } else if (x[i] > second && x[i] != first) {
                second = x[i];
            }
        }
        System.out.println("Max = " + first + " Second max = " + second);
        for (int i = 0; i < x.length; i++) {
            if (x[i] != first && x[i] != second)
                System.out.print(x[i] + " ");
        }

    }

    public static String reverse(String input) {
        int len = input.length();
        if (len == 0 || len == 1)
            return input;
        return input.charAt(len - 1) + reverse(input.substring(0, len - 1));
    }
}

class Boy {
    private int id;
    private String name;

    Boy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

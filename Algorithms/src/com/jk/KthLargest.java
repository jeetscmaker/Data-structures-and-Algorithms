import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class KthLargest {
    public static void main(String[] args) {
        int[] a = new int[] {3, 5, 5, 7, 8, 7, 9, 9};
        // find the 3rd largest number in the array.
        Arrays.sort(a);
        int ans = a[0], count = 1;
        for(int i = a.length-1; i-1>=0; i--) {
            if(a[i] != a[i-1]) {
                count++;
                if(count == 3) {
                    ans = a[i-1];
                    break;
                }
            }
        }
        System.out.println("The 3rd largest number is: " + ans);

        // finding the kth large number using stream APIs.
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int k = 5;
        long numberOfDistinctElements = list.stream().distinct().count();
        Optional<Integer> kthLargest = list.stream()
                .distinct()
                .sorted()
                .limit(numberOfDistinctElements-k+1)
                .sorted(Comparator.reverseOrder())
                .findFirst();
        System.out.println(kthLargest.get());
    }
}

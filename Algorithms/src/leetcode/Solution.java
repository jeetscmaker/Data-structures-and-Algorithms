package leetcode;
/** Find Numbers with Even Number of Digits.
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * */
class Solution {
    public static boolean hasEvenNumberOfDigits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return (count%2 == 0);
    }

    public int findNumbers(int[] a) {
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(hasEvenNumberOfDigits(a[i]))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

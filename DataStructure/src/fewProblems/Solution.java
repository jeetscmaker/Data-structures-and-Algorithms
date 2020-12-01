package fewProblems;
/**
 * Print concatenated form of A times 'a' and B times 'b' such that no character repeated
 * thrice in a row. e.g. aaab, abbba such strings are not allowed; Because a has been
 * repeated thrice in 1st string and b has been repeated thrice in 2nd string.
 * The better solution wii be: aaba and ababb etc.
 * */
public class Solution {
    public String solution(int A, int B) {
        // write your code in Java SE 8
        StringBuilder s = new StringBuilder("");
        if(A == B){
            for(int i=0; i<A; i++){
                s.append("a").append("b");
            }
        } else if(A < B){
            while(B!=0 && A !=0){
                if(B<2){
                    s.append("b").append("a");
                    B--;
                    A--;
                } else{
                    s.append("bb").append("a");
                    B = B-2;
                    A--;
                }
            }
            if(A!=0 ){
                for(int i=0; i<A; i++){
                    s.append("a");
                }
            }
            if(B!=0 ){
                for(int i=0; i<B; i++){
                    s.append("b");
                }
            }
        }
        else{
            while(A!=0 && B !=0){
                if(A<2){
                    s.append("a").append("b");
                    A--;
                    B--;
                } else{
                    s.append("aa").append("b");
                    A = A-2;
                    B--;
                }
            }
            if(B!=0 ){
                for(int i=0; i<B; i++){
                    s.append("b");
                }
            }
            if(A!=0 ){
                for(int i=0; i<A; i++){
                    s.append("a");
                }
            }
        }
        return s.toString();
    }
}

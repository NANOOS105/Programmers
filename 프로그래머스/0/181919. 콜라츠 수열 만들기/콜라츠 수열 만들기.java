import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> al = new ArrayList <> ();
        al.add(n);

        while(n != 1){

            if(n % 2 == 0){
                n /= 2;
            }
            else if(n % 2 != 0){
                n = (3 * n + 1);
            }
            al.add(n);
        }
        int[] answer = new int[al.size()];
        for(int i = 0; i < answer.length; i ++){
            answer[i] = al.get(i);
        }

        return answer;
    }
}
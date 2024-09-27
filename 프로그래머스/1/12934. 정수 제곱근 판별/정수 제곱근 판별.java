import java.util.*;

class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);
        long answer = 0;
        if(x % 1 == 0){
            answer = (long)Math.pow((long)x+1,2);
        }else{
            answer = -1;
        }
        return answer;
    }
}
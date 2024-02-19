import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int j=0;j<arr.length;j++){
            for(int i = 0; i<arr[j];i++){
             answer.add(arr[j]);
            }
        }
        return answer;
    }
}
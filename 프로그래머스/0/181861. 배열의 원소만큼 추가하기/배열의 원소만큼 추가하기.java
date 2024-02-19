import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int j=0;j<arr.length;j++){
            for(int i = 0; i<arr[j];i++){
             list.add(arr[j]);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
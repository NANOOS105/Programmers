import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> lis = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(lis.isEmpty() || lis.get(lis.size() - 1) != arr[i]){
                    lis.add(arr[i]);
            }
        }     
        
        int[] answer = new int[lis.size()];
        for(int i=0; i<lis.size(); i++){
            answer[i] = lis.get(i);
        }
        return answer;
    }
}
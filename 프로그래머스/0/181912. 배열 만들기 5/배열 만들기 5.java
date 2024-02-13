import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        String temp = "";
        int num = 0;
        
        for(int i=0; i<intStrs.length; i++){
            temp = intStrs[i].substring(s,l+s);
            num = Integer.parseInt(temp);
            if(num>k){
                arr.add(num);
            }    
        }
          int[] answer = new int[arr.size()]; 
        for(int i = 0; i<arr.size();i++){
           answer[i] = arr.get(i); 
        }
        return answer;
    }
}
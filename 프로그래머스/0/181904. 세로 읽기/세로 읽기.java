import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        
        char[] arr = my_string.toCharArray();
        ArrayList<Character> sarr = new ArrayList<>();
        
        for(int i = c-1; i<my_string.length();){
            sarr.add(arr[i]);
            i += m;
        }
        
        //create object of StringBuilder class
        StringBuilder sb = new StringBuilder();
        
        //Appens characters one by one
        for(Character ch : sarr){
            sb.append(ch);
        }  
        String answer = sb.toString();
        return answer;
    }
}
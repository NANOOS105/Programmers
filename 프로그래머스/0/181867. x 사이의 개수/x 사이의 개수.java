import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] arr = myString.split("x");
        
        for(int i = 0; i<arr.length; i++){
            list.add(arr[i].length());
        }
        
        if(myString.endsWith("x")){
            list.add(0);
        }
        return list;
    }
}
import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(list.size()==0){
                list.add(arr[i]);
            }else if(list.size() !=0 && list.get(list.size()-1) == arr[i]){
                list.remove(list.size()-1);
            }else if(list.size() !=0 && list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }//for문 끝      
        if(list.size()==0) list.add(-1);
        return list;
    }
}
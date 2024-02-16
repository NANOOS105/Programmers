import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        int[] temp = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<query.length; i++){
            if(i%2==0 && i ==0){
               temp = Arrays.copyOfRange(arr,0,query[i]+1);
              
            }else if(i%2==1 && i ==1){
                temp = Arrays.copyOfRange(arr,query[i],arr.length);                
            }else if(i%2==0&& i !=0){
                temp = Arrays.copyOfRange(temp,0,query[i]+1);
                
            }else if(i%2==1 && i !=1){
                temp = Arrays.copyOfRange(temp,query[i],temp.length);
            
            }
        }
        return temp;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
             int cn = -1 ;
            for(int j=queries[i][0]; j<= queries[i][1]; j++){
                if(cn == -1 && queries[i][2] < arr[j]){
                  cn = arr[j];   
                }else if(queries[i][2] < arr[j]){
                    cn = Math.min(cn,arr[j]);
                }
            }answer[i]=cn;
        } return answer;
    } 
 }


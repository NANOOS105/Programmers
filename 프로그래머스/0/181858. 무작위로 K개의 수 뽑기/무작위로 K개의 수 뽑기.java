import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr1  = new ArrayList<>();
        list.add(arr[0]);
        
        
          for(int i=0; i<arr.length; i++){ 
                if(list.size()<k){
            //중복되는 값이 있는지 확인하면서 채우기
              int cnt = 0;
              for(int j=list.size()-1; j>=0; j--){
                  if(list.get(j)==arr[i]){
                    cnt++;
                }
             }
                    if(cnt==0){
                        list.add(arr[i]);
                    }
            } 
          }//for문 끝 
        //list의 크기가 k보다 작을 경우 커질때까지 -1 넣기
        while(list.size() < k){
            list.add(-1);
        }
        return list;
    }
}
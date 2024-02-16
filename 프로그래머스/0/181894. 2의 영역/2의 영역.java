import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        //2가 들어가는 idx 추출해서 list에 넣기
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                list.add(i);
            } 
            //list 첫번째, 끝 idx로 배열값 복사 
        }
        if(list.size()==0){
             answer = new int[]{-1};
        }else{
            answer = Arrays.copyOfRange(arr,list.get(0),list.get(list.size()-1)+1);
        }
        return answer;
    }
}
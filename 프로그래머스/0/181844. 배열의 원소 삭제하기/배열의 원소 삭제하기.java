import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //배열을 List로 바꿔주기 
        for(int i=0; i<arr.length;i++){
            list.add(arr[i]);
        }
        //List에 delete_list와 중복요소 있는지 확인
        //중복되면 List에서 제거 
        for(int j=0; j<delete_list.length; j++){
            for(int i=0; i<list.size(); i++){
                if(list.get(i) == delete_list[j]){
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
}
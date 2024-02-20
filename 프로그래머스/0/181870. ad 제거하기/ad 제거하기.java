import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        //"ad"들어간 원소 null값으로 초기화
        for(int i = 0; i<strArr.length;i++){
            if(strArr[i].contains("ad")){
                strArr[i] = null;
            }
            //null값이 아니면 바로 list에 추가 
            if(strArr[i] != null){
                list.add(strArr[i]);
            }
        }       
        return list;
    }
}
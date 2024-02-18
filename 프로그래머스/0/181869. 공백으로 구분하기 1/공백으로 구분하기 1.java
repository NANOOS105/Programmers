import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        char[] ch = my_string.toCharArray();
        ArrayList<Integer> empty = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<my_string.length();i++){
            if(ch[i]==' '){
                empty.add(i);
            }
        }    
    
        //공백이 존재하지 않는 경우
       if(empty.size()==0){
          return new String[]{my_string};
       } 
        //공백이 1개 이상인 경우
        else{
            //첫번째 문자열 리스트 추가
            list.add(my_string.substring(0,empty.get(0)));
            
            //중간 문자열 리스트 추가
            for(int i= 0; i<empty.size()-1;i++){
                list.add(my_string.substring(empty.get(i)+1,empty.get(i+1)));
            }
            
            //마지막 문자열 리스트 추가
            //empty의 마지막 배열+1 < 다음 idx부터 끝까지 더하기
            list.add(my_string.substring(empty.get(empty.size()-1)+1));
        
        String[] answer = new String[empty.size()+1];   
        int i=0;
        for(String s : list){
            answer[i++] = s;
         }
            return answer;
       }  
    }
}
import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s="";
        
        //String 배열로 처리
        String[] arr = String.valueOf(n).split("");
        
        //오름차순 정렬
        Arrays.sort(arr);
        
        //내림차순으로 넣으면서 문자열로 만들어주기
        for(int i=arr.length-1; i >= 0; i--){
            s += arr[i];
        }
        
        //long으로 변환
        answer = Long.parseLong(s);
        return answer;
    }
}
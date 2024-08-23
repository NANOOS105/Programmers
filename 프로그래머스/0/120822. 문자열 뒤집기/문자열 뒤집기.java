class Solution {
    public String solution(String my_string) {
        
        //문자열을 배열로 반환
        char[] charArr =  my_string.toCharArray();
        String answer = "";
        
        for(int i = charArr.length-1; i > -1; i--){
            answer += charArr[i];
        }
        
        return answer;
    }
}
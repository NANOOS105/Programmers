class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();        
        for(char ch : arr){
            if(ch<108){
                ch=108;
            }
            answer += ch;
        } 
        return answer;
    }
}
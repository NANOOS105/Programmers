class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String pn = "";
        pn = phone_number.substring(phone_number.length()-4);
        
        for(int i=0; i<phone_number.length()-4; i++){
            answer += "*";
        }
        
        answer = answer + pn;
        return answer;
    }
}
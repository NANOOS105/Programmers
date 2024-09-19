class Solution {
    public String solution(String my_string, int n) {
        
        char[] stringChar = my_string.toCharArray();
        String answer = "";
        for(int i=0; i < stringChar.length; i++){
            for(int j=0; j<n; j++){
                answer += stringChar[i];
            }
        }       
        return answer;
    }
}
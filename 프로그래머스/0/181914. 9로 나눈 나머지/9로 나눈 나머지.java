class Solution {
    public int solution(String number) {
        int answer = 0;
        int[] str = new int[number.length()];
        
        for(int i=0; i<number.length();i++){
            answer += Character.getNumericValue(number.charAt(i));
            }
        
        answer=answer % 9;
        return answer;
    }
}
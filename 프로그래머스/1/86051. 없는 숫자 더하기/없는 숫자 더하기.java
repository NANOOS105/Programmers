class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        //0~9까지 모든 수의 합 더하기
        for(int i = 0; i < 10; i++){
         answer += i;
        }
        
        //배열에 있는 값 빼기
        for(int number : numbers){
            answer -= number;
        }
        return answer;
    }
}
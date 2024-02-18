class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int i=0; i<numbers.length;i++){
            //n보다 커질 때까지 이기떄문에 같거나 작을때까지 더해주어야함
            if(answer <= n){
                answer += numbers[i];
            }
        }
        return answer;
    }
}
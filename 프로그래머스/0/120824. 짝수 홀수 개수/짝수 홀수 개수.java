class Solution {
    public int[] solution(int[] num_list) {
        int x=0; //짝수용
        int y=0; //홀수용
        int[] answer = new int[2];
        for(int i=0;i<num_list.length;i++){
            if(num_list[i] % 2 == 0){
                //짝수인 경우 계산
                x++;
            }else{
                y++;
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}
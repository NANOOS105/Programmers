class Solution {
    public int[] solution(int[] arr) {
        int num = 1;
        
        while(num < arr.length){
        if(num==arr.length) break;
            num *= 2;
        }
        
        int[] answer = new int[num];
        
        //모두 0으로 채우기
        for(int i=0; i<num; i++){
            answer[i] = 0;
        }
        //arr[i] 다시 채우기
            for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
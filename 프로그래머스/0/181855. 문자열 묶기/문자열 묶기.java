class Solution {
    public int solution(String[] strArr) {
        int temp=0;
        int temp1=0;
        int[] num = new int[30];
        
        //원소의 길이에 일치하는 배열에 일치할때마다 카운트 증가
        for(int i=0; i<strArr.length;i++){
            num[strArr[i].length()-1] += 1;
        }
        //가장 큰 배열값 찾기
        for(int i=0; i<num.length;i++){
            if(num[i] != 0){
                temp = num[i];
            }
            temp1 = Math.max(temp,temp1);
        }
        return temp1;
    }
}
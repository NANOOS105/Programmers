class Solution {
    public int solution(int n) {
        int x = 1; // 증가하는 자연수
        int y = 0; // 나머지
        
        while(y != 1){
            y = n % x;
            
            if(y==1){
                break;
            }
            
            x++;
        }
        return x;
    }
}
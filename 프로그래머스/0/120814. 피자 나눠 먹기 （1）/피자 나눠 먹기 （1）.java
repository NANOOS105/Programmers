class Solution {
    public int solution(int n) {
        int pizza=1;
        
        while((7*pizza)/n < 1){
            pizza++;
        }
        
        return pizza;
    }
}
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] wasd = new char[control.length()];
        
        for(int i=0; i < wasd.length;i++){
            wasd[i]=control.charAt(i);
            if(wasd[i]=='w'){
                n += 1;
            }else if(wasd[i]=='s'){
                n -= 1;
            }else if(wasd[i]=='d'){
                n += 10;
            }else{
                n -= 10;
            }
        }
        answer = n;
        
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        int p = 0;
        int y = 0;
        
        for(int i=0; i < arr.length; i++){
            if(arr[i]=='p'|| arr[i]=='P'){
                p++;
            }else if(arr[i]=='y'|| arr[i]=='Y'){
                y++;
            }
        }
        
        if(p != y){
            answer = false;
        }

        return answer;
    }
}
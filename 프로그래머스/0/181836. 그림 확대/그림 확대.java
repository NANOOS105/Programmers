class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
       
        int cnt = 0;
        
        for(String p : picture){
            String temp = "";
            for(int i=0; i<p.length(); i++){
                char pix = p.charAt(i);
                
                for(int j=0; j<k; j++){
                    temp += pix;
                }
            }//행 문자열 끝
            
            for(int i=0; i<k; i++){
                answer[cnt++]=temp;
            }
        }
        return answer;
    }
}
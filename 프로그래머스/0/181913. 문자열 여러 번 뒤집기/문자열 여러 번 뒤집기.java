class Solution {
    public String solution(String my_string, int[][] queries) {
        
        String answer = "";
        char[] temp_arr = my_string.toCharArray();
        
        for(int i=0; i<queries.length;i++){   
            int start = queries[i][0];
            int end = queries[i][1];
            char temp = ' ';
            while(start < end){
                temp = temp_arr[start];
                temp_arr[start] = temp_arr[end];
                temp_arr[end] = temp;
                start++;
                end--;
            } //while문 끝    
        } //for문 끝
         answer = new String(temp_arr);
        return answer;
        
    }
}
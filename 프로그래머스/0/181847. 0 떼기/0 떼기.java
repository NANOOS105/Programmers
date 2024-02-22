class Solution {
    public String solution(String n_str) {
        String answer = "";
        int i=0;
        char[] arr = n_str.toCharArray();
        while(arr[i]=='0'){
            i++;              
        }
        n_str = n_str.substring(i);
        return n_str;
    }
}
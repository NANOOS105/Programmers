class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char temp = ' ';
  
        while(s<e){
                temp = arr[s];
                arr[s] = arr[e];
               arr[e] = temp;
                s++;
                e--;
             }
        answer = new String(arr);
        return answer;
    }
}
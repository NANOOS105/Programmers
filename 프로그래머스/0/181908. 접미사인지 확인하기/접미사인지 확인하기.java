import java.util.*; 

class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] answer = new String[my_string.length()];
        int result = 0;
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
            }
        for(int j=0; j<answer.length;j++){
              if(answer[j].equals(is_suffix)){
                  result=1;
                  break;
              } else {result =0;}
        }
        return result;
    }
}
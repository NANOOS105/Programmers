class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        
        for(int i=0; i<myString.length();i++){
            if(arr[i]<97){
                arr[i] += 32;
            }
        }
        
        StringBuilder sb = new StringBuilder();      
        for(char ch : arr){
            sb.append(ch);
        }
        return sb.toString();
    }
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] arr = myString.split("");
        String s = "";
        
        for(int i=0; i<arr.length;i++){
            if(arr[i].equals("A")){
                arr[i] = "B";
            }
             else if(arr[i].equals("B")){ 
                arr[i] = "A"; 
             }
            s += arr[i];
               }
        if(s.contains(pat)) return 1;
        return answer;
    }
}
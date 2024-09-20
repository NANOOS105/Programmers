class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xx = String.valueOf(x);
        char[] arr = xx.toCharArray();
        int sum = 0;
        
        for(int i=0; i < arr.length; i++){
            sum += Character.getNumericValue(arr[i]);
        }
        
        if(x % sum != 0) {answer = false;}
        return answer;
    }
}
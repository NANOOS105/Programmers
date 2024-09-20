class Solution {
    public int[] solution(long n) {
        String nn = Long.toString(n);
        char[] arr = nn.toCharArray();
        int[] answer = new int[arr.length];
        
        for(int i=0; i < arr.length; i++){
            answer[i] = Character.getNumericValue(arr[arr.length-(i+1)]);
        }
        return answer;
    }
}
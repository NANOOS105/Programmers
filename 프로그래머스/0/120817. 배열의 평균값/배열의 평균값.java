class Solution {
    public double solution(int[] numbers) {
        int sum=0;
        for(int number : numbers){
            sum += number;
        }
        double answer = sum/(double)numbers.length;
        return answer;
    }
}
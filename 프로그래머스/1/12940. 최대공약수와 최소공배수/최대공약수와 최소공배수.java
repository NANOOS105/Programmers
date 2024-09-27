class Solution {
    public int[] solution(int n, int m) {
        int max = 0;
        int min = 0;
        
        int a = n;
        int b = m;
        
        //최대공약수 구하기
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
         }
        max = a;
        
        //최소공배수 구하기
        min = (n * m)/max;
        
        int[] answer = new int[]{max,min};
        return answer;
    }
}
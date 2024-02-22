import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger a1 = new BigInteger(a);
        BigInteger a2 = new BigInteger(b);
        answer += a1.add(a2);
        return answer;
    }
}
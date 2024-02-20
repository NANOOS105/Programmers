class Solution {
    public String solution(String myString, String pat) {
        int n=0;        
        n = myString.lastIndexOf(pat);
        myString = myString.substring(0,n+pat.length());
        return myString;
    }
}
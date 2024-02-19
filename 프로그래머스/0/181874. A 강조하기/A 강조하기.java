class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] ch = myString.toCharArray();
        String s="";
        
        for(int i=0; i<myString.length();i++){
            if(ch[i] == 'a'){
                ch[i] ='A';
                answer += ch[i];
            }else if(ch[i] !='a' && ch[i] != 'A'){
                s = ""+ch[i];
                s = s.toLowerCase();
                answer += s;
            }else{
                answer += ch[i];
            }
        }
        return answer;
    }
}
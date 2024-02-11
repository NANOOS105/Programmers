import java.lang.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if( a == b && c == d && a == c){
            answer = 1111 * a;
        }
        
        else if(a == b && c == a && d != a){
            answer = (10*a+d)*(10*a+d);
        }else if(a == b && a == d && c != a){
            answer = (10*a+c)*(10*a+c);}
            else if(a == c && c == d && b != a){
            answer = (10*a+b)*(10*a+b);}
                else if(b == c && c == d && d != a){
            answer = (10*d+a)*(10*d+a);}
                    

        else if(a==b && c != a && c==d){
            answer = (a+c)*Math.abs(a-c);
        }else if(a==d && c != a && c==b){
            answer = (a+c)*Math.abs(a-c);
        }else if(a==c && b != a && b==d){
            answer = (a+b)*Math.abs(a-b);
        }
        
        
        else if(a==b && c != a && d != a && c != d){
            answer = c*d;
        }else if(a==c && b != a && d != a && b != d){
            answer = b*d;
        }else if(a==d && c != a && b != a && c != b){
            answer = c*b;
        }else if(b==c && c != a && c != d && a != d){
            answer = a*d;
        }else if(b==d && c != b && b != a && c != a){
            answer = c*a;
        }else if(c==d && c != a && b != c && a != b){
            answer = a*b;
        }
        
        else if(a!=b && a!=c && a!=d && b != c && b!=d && c!=d){
            answer = Math.min(a,b);
            answer = Math.min(c,answer);
            answer = Math.min(d,answer);
        }
        return answer;
    }
}
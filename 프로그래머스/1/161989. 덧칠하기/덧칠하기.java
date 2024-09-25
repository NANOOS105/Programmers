import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        HashMap<Integer,Boolean> wall = new HashMap<>();
        int answer = 0;
        //맵에 벽넘버, boolean값 넣기
        for(int i=0; i<n; i++){
            wall.put(i,true);
        }
        
        //안칠해진 부분 false
        for(int i=0; i<section.length; i++){
            wall.put(section[i]-1,false);
        }
        
        //벽 처음부터 순회하면서 칠하기
        for(int i=0; i<n; i++){
            if(wall.get(i)==false){
                int idx = i;
                for(int j=0; j < m; j++){//안칠해진곳부터 롤러길이만큼 다 true
                    wall.put(idx,true);
                    idx++;
                }
                answer++;
            }
        }
        return answer;
    }
}
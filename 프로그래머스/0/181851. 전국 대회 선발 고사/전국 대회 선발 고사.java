import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;      
        int a = 0, b=0, c=0;
        for(int i=0; i<attendance.length;i++){
            if(attendance[i]==true){
                list.add(rank[i]);
            }
        }
        //랭크 오름차순으로 정렬
        list.sort(Comparator.naturalOrder());
        //Collections.sort(list);        
        for(int i=0; i<rank.length;i++){
            if(rank[i]==list.get(0)){
                a = i;
            }else if(rank[i]==list.get(1)){
                b = i;
            }else if(rank[i]==list.get(2)){
                c = i;
            }
        }
        answer = 10000 * a + 100 * b + c;
        return answer;
    }
}
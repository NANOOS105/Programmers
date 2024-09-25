import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String,Integer> mapP = new HashMap<>();
        HashMap<Integer,String> mapR = new HashMap<>();
        
        String loser = "";
        int rank = 0;
        for(int i=0; i < players.length; i++){
            mapP.put(players[i],i);
            mapR.put(i,players[i]);
        }
        
        for(int j=0; j < callings.length; j++){
            rank = mapP.get(callings[j]);
            loser = mapR.get(rank-1);
            mapR.put(rank,loser);
            mapR.put(rank-1,callings[j]);
            mapP.put(loser,rank);
            mapP.put(callings[j],rank-1);
        }
        
        //map을 배열에 채워넣기
        for(int i=0; i < players.length; i++){
            players[i] = mapR.get(i);
        }
        return players;
    }
}
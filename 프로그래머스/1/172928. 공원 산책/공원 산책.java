class Solution {
    public int[] solution(String[] park, String[] routes) {
        //공원 가로/세로 길이 구하기
        int parkWidth = park[0].length();
        int parkHeight = park.length;
        
        //위치이동 변수(E,S는 y, S,N는 x)
        int x = 0;
        int y = 0;
        
        //시작 위치 찾기
        for (int i = 0; i < parkHeight; i++) {
            for (int j = 0; j < parkWidth; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        for(int i=0; i < routes.length; i++){
            String direc = routes[i].split(" ")[0];
            int move = Integer.parseInt(routes[i].split(" ")[1]);
            int tempx = x;
            int tempy = y;
            boolean canMove = true;
            
            for(int j=0; j < move; j++){
                switch(direc){
                case "E": tempy++; break;
                case "W": tempy--; break;
                case "N": tempx--; break;
                case "S": tempx++; break;
                    }
                
            if (tempx < 0 || tempx >= parkHeight || 
                tempy < 0 || tempy >= parkWidth|| 
                park[tempx].charAt(tempy) == 'X') {
                    tempx = x;
                    tempy = y;
                    break;
                }
          }       
            // 이동이 성공적으로 완료되었다면 위치 업데이트
            x = tempx;
            y = tempy;
        }
    int[] answer = new int[]{x,y};
    return answer;
    }
}
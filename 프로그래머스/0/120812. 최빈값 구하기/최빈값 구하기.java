class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        
        for(int i=0; i < array.length; i++ ){
            count[array[i]]++;
        }
        
        int maxCount = 0;
        int mode = -1;
        boolean multipleMode = false;
        
        for(int i = 0; i < 1000; i++) {
            if(count[i] > maxCount){
                maxCount = count[i];
                mode = i;
                multipleMode = false;
            }else if(count[i] == maxCount){
                multipleMode = true;
            }
        }
        
        if(multipleMode){
            return -1;
        }else{
            return mode;
        }
    }
}
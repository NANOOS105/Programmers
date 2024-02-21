import java.util.*; 

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0; i<flag.length; i++){
            if(flag[i]==true){
                for(int k =0; k<arr[i]; k++){
                list.add(arr[i]);
                list.add(arr[i]);
                }
            }else{
                for(int j=0; j<arr[i]; j++){
                list.remove(list.size()-1);
                }
            }//else문 끝 
        }//for문 끝
        return list;
    }
}
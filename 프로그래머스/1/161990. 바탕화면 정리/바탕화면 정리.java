import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int a = 0;
        for (String b : wallpaper){
            String [] c = b.split("");
            for (String d : c){
                if (d.equals("#"))
                    a+=1;
            }
        }
        int [] aa = new int [a];
        int [] aaa = new int [a];
        int k =0;
        for (int i=0; i<wallpaper.length;i++){
            String [] bb = wallpaper[i].split("");
            for (int j=0; j<bb.length;j++){
                if (bb[j].equals("#")){
                    aa[k] = i;
                    aaa[k] = j;
                    k+=1;
                }
                    
            }
        }
        Arrays.sort(aa);
        Arrays.sort(aaa);
        
        int[] answer = {aa[0], aaa[0], aa[aa.length-1]+1, aaa[aaa.length-1]+1};
        return answer;
    }
}
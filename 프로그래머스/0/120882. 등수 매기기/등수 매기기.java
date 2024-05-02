import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int [score.length];
        Integer[] a = new Integer[score.length];
        Integer[] b= new Integer[score.length];
        for (int i=0; i<score.length; i++){
            a[i] = (score[i][0]+score[i][1])*10/2;
            b[i] = (score[i][0]+score[i][1])*10/2;
        }
        Arrays.sort(b, Collections.reverseOrder());
        for (int i=0; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                if ((a[i]+"").equals(b[j]+"")){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }
}
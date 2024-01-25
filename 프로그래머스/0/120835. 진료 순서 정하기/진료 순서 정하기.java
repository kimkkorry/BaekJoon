import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
       int aa = emergency.length;
        int[] answer = new int [emergency.length];
        int [][] a = new int [aa][2];
        for (int i=0; i<aa;i++)
            a[i][0] = emergency[i];
        Arrays.sort(emergency);
        for (int i=0; i<aa;i++){
            for (int j=0; j<aa;j++){
                if (a[i][0]==emergency[j])
                    a[i][1]=aa-j;
            }
        }
        for (int i=0; i<aa;i++)
            answer[i] = a[i][1];
        
        return answer;
    }
}
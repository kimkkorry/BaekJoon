import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<rank.length; i++){
            if (attendance[i])
                a.add(rank[i]);
        }
        Collections.sort(a);
        int[] b = new int [3];
        for (int i=0; i<3; i++)
            b[i] = a.get(i);
        
        int [] c = new int [3];
        for (int i=0; i<3; i++){
            for (int j=0; j<rank.length; j++){
                if (b[i] == rank[j])
                    c[i] = j;
            }
        }
        answer = c[0]*10000+ c[1]*100+c[2];
        
        return answer;
    }
}
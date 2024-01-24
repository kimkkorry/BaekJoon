import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=1; i<n+1;i++){
            if (n%i==0)
                a.add(i);
        }
        
        int[] answer = new int[a.size()];
        for (int i=0; i<a.size();i++)
            answer[i] = a.get(i);
        return answer;
    }
}
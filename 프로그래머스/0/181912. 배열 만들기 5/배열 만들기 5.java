import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> a = new ArrayList<>();
        for (String intS : intStrs){
            int b = Integer.parseInt(intS.substring(s, s+l));
            if (b>k)
                a.add(b);
        }
        int[] answer = new int [a.size()];
        for (int i=0; i<answer.length;i++)
            answer[i] = a.get(i);
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        int b = 2;
        while(b<=n){
            if (n%b==0){
                n = n/b;
                if (!a.contains(b))
                a.add(b);
            }
            else
                b+=1;
            if (b>n)
                break;
        }
        int[] answer = new int[a.size()];
        for (int i=0; i<a.size();i++)
            answer[i] = a.get(i);
        return answer;
    }
}
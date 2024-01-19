import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int ar : arr){
            for (int i=0; i<ar;i++)
                a.add(ar);
        }
        int[] answer = new int [a.size()];
        for (int i=0; i<a.size();i++)
            answer [i] = a.get(i);
        return answer;
    }
}
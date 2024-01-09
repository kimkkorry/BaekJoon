import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i]<min)
                min = arr[i];
        }
        ArrayList<Integer> aa = new ArrayList<>();
        int[] answer = new int[arr.length-1];
        for (int a : arr){
            if (a != min)
                aa.add(a);
        }
        for (int i=0; i<aa.size();i++)
            answer[i] = aa.get(i);
        
        return answer;
        
    }
}
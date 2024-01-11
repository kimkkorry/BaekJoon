import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> a = new HashSet<>();
        for (int i=0; i<numbers.length;i++){
            for (int j=0; j<numbers.length;j++){
                if (i!=j)
                    a.add(numbers[i]+numbers[j]);
            }
        }
        
        ArrayList<Integer> b = new ArrayList<>(a);
        int[] answer = new int [b.size()];
        for (int i=0; i<b.size();i++)
            answer[i] = b.get(i);
        Arrays.sort(answer);
        return answer;
    }
}
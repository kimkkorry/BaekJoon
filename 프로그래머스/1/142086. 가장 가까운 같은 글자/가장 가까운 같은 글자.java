import java.util.*;
class Solution {
    public int[] solution(String s) {
          int[] answer = new int [s.length()];
        ArrayList<String> a = new ArrayList<>();
        String aa [] = s.split("");
        for ( int i=0; i<s.length();i++){
            if (!a.contains(aa[i])){
                a.add(aa[i]);
                answer[i] = -1;
            }
            else{
                int index = 0;
                for (int j=0; j<i;j++){
                    if (aa[i].equals(aa[j]))
                        index = j;
                }
                answer[i] = i-index;
            }
        }
      
        return answer;
    }
}
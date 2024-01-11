import java.util.*;
class Solution {
    public String solution(String s) {
        String [] a = s.split("");
        Arrays.sort(a, Collections.reverseOrder());
        String answer = "";
        for (String b : a)
            answer += b;
        return answer;
    }
}
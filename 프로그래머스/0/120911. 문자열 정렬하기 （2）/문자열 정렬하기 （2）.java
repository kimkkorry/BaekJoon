import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] a = (my_string.toLowerCase()).split(""); 
        Arrays.sort(a);
        String answer = "";
        for (String aa : a)
            answer += aa;
        return answer;
    }
}
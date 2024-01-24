import java.util.*;
class Solution {
    public String solution(String my_string) {
        ArrayList<String> b = new ArrayList<>();
        String answer = "";
        String a [] = my_string.split("");
        for (String aa : a){
            if (!b.contains(aa)){
                answer += aa;
                b.add(aa);
            }
        }
        return answer;
    }
}
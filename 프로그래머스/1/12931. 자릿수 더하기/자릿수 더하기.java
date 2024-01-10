import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
String[] a = (n+"").split("");
        for (String b:a)
            answer += Integer.parseInt(b);

        return answer;
    }
}
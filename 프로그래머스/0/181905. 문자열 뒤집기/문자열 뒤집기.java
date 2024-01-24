class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a [] = my_string.split("");
        for (int i=0; i<a.length;i++){
            if (i>=s&&i<=e)
                answer += a[e-i+s];
            else
                answer += a[i];
        }
        return answer;
    }
}
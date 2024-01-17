class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] a = my_string.split("");
        for (String aa : a)
            answer += aa.repeat(n);
        return answer;
    }
}
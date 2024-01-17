class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String [] a = cipher.split("");
        for (int i=code-1; i<cipher.length();i+=code)
            answer += a[i];
        return answer;
    }
}
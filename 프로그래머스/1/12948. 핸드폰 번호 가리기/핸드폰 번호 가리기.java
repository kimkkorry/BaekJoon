class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int a = phone_number.length();
        String b = phone_number.substring(a-4, a);
        answer += "*".repeat(a-4);
        answer += b;
        return answer;
    }
}
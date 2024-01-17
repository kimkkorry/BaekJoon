class Solution {
    public String solution(String my_string) {
        String answer = "";
        String a [] = my_string.split("");
        for (String aa : a){
            int b = aa.charAt(0);
            if (b>=97&&b<=122)
                answer += aa.toUpperCase();
            else if (b>=65&&b<=90)
                answer += aa.toLowerCase();
        }
        return answer;
    }
}
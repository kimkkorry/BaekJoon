class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String a [] = rny_string.split("");
        for (String aa : a){
            if (aa.equals("m"))
                answer += "rn";
            else
                answer += aa;
        }
        return answer;
    }
}
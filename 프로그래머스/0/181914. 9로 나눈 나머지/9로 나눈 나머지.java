class Solution {
    public int solution(String number) {
        String a [] = number.split("");
        int b = 0;
        for (String aa : a)
            b += Integer.parseInt(aa);
        int answer = b%9;
        return answer;
    }
}
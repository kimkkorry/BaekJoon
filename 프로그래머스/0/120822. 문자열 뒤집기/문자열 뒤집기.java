class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] a = my_string.split("");
        for (int i=a.length-1; i>-1; i--)
            answer+= a[i];
        return answer;
    }
}
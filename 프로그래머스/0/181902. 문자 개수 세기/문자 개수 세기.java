class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        String a[] = my_string.split("");
        for (String aa : a){
            int b = aa.charAt(0);
            if (b>=65&&b<=90){
                answer[b-65] +=1;
            }
            else {
                answer[b-97+26] += 1;
            }
        }
        return answer;
    }
}
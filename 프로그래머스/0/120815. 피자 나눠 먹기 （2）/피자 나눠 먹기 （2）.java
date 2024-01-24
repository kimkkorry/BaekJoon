class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 6;
        while(true){
            if (a%n == 0){
                answer = a/6;
                break;
            }
            else
                a+=6;
        }
        return answer;
    }
}
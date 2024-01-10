class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
int total = 45;
    int a = 0;
        for (int b : numbers)
            a+=b;
        answer = total - a;
        return answer;
    }
}
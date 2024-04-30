class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int j = -1;
        for (int i = 1; i<=k; i++){
            j += 2;
            if (j>numbers.length)
                j = j - numbers.length;   
        }
        answer = j;
        return answer;
    }
}
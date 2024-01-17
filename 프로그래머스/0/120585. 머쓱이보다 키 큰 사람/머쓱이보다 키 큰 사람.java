class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int ar : array){
            if (ar>height)
                answer +=1;
        }
        return answer;
    }
}
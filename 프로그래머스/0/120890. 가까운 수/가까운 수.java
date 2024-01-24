class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for (int ar : array){
            if (Math.abs(n-ar)<Math.abs(n-answer))
                answer = ar;
            else if(Math.abs(n-ar)==Math.abs(n-answer)){
                if (answer>ar)
                    answer = ar;
            }
        }
        return answer;
    }
}
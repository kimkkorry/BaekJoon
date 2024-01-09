class Solution {
    public double solution(int[] arr) {
        double a = 0;
        for (double b:arr)
            a+=b;
        double answer = a/arr.length;
        return answer;
    }
}
class Solution {
    public int solution(int a, int b, int n) {
        int answer = (n/a) * b;
        int aa = n%a;
        n = answer + aa;
        while(n>=a){
            if (n<a)
                break;
            int aaa = (n/a) * b;
            answer += aaa;
            aa = n%a;
            n = aaa+aa;
        }
        return answer;
    }
}
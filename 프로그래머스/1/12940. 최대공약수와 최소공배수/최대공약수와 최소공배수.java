class Solution {
    public int[] solution(int n, int m) {
        
        int[] answer = new int[2];
        int a  = 1;
        if (n>m){
            int c = n;
            n = m;
            m = c;
        }
        for (int i=1; i<=n;i++){
            if (n%i==0&&m%i==0)
                a = i;
        }
        answer[0] = a;
        answer[1] = m/a*n;
        
        return answer;
    }
}
class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double a = 1;
        double b = 1; 
        for (int i=1; i<=(balls-share); i++)
            b = b*i;
        for (int i=share+1; i<=balls; i++)
            a = a*i;
        answer = (int)(a/b);
        return answer;
    }
}
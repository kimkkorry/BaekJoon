class Solution {
    public int solution(int chicken) {
        int answer = chicken/10;
        int cou = chicken/10 + chicken%10;
        while(cou>=10){
            if (cou<10)
                break;
            else{
                answer += cou/10;
                cou = cou/10+cou%10;
            }
        }
        return answer;
    }
}
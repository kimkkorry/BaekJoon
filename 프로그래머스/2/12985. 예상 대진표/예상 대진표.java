class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a!=b){
            if (a==b)
                break;
            int aa = a%2;
            a = a/2;
            if (aa != 0)
                a+=1;
            int bb = b%2;
            b = b/2;
            if (bb !=0)
                b+=1;
            answer +=1;
            
        }

        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        if (s.charAt(0)==')')
            answer = false;
        else{
            int a = 0;
            for (int i =0; i<s.length(); i++){
                if (s.charAt(i)=='(')
                    a+=1;
                else if (s.charAt(i)==')')
                    a-=1;
                if (a<0){
                    answer = false;
                    break;
                }
            }
            if (a!=0)
                answer = false;
        }

        return answer;
    }
}
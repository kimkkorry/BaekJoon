class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String [] a = my_string.split("");
        for (int i=0 ;i<a.length;i++){
            int b = 0;
            for (int ind : indices){
                if (i==ind){
                    b+=1;
                    break;
                }
            }
            if (b==0)
                answer += a[i];
        }
        return answer;
    }
}
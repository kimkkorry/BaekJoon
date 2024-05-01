class Solution {
    public String solution(String s) {
        String answer = "";
        String [] aa = s.split("");
        int a = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)-65>=0&&s.charAt(i)-65<=25){
                if (a==1){
                    aa[i] = aa[i].toLowerCase();
                a=1;
                }
                else
                    a=1;
            }
            else if (s.charAt(i)-97>=0&&s.charAt(i)-97<=25){
                if (a==0){
                    aa[i] = aa[i].toUpperCase();
                    a = 1;
                }
            }
            else if (s.charAt(i) - 32 == 0)
                a = 0;
            else 
                a = 1;
        }
        for (int i = 0; i<aa.length;i++)
            answer += aa[i];
        return answer;
    }
}
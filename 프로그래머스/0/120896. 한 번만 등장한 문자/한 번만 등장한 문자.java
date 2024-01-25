class Solution {
    public String solution(String s) {
        int [] a = new int [26];
        String [] aa = new String [26];
            
        String [] b = s.split("");
        for (String bb : b)
        a[bb.charAt(0)-97]+=1;
        String answer = "";
        for (int i=0; i<a.length;i++){
            if (a[i] == 1)
                answer += ((char)(i+97)+"");
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String s, int n) {
        String [] a = new String [26];
        String [] A = new String [26];
        for (int i = 0; i<26; i++)
            a[i] = (char)('a'+i)+"";
         for (int i = 0; i<26; i++)
            A[i] = (char)('A'+i)+"";
        String answer = "";
        String []ss = s.split("");
        for (String sss : ss){
            char c = sss.charAt(0);
            if (65<=c&&90>=c){
                int index = c-65 + n;
                if (index>25)
                    index -= 26;
                answer += A[index];
            }
            else if (97<=c&&122>=c){
                int index = c-97 + n;
                if (index>25)
                    index -= 26;
                answer += a[index];
            }
            else
                answer += sss;
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String s) {
       String answer = "";
        String [] a = s.split(" ", -1);
        
        for (int i=0; i<a.length-1; i++){
            String b [] = a[i].split("");
            for (int j = 0; j<b.length;j++){
            if(j%2 == 0)
                answer += b[j].toUpperCase();
            else
                answer += b[j].toLowerCase();
        }
            answer += " ";
        }
        String c [] = a[a.length-1].split("");
        for (int j = 0; j<c.length;j++){
            if(j%2 == 0)
                answer += c[j].toUpperCase();
            else
                answer += c[j].toLowerCase();
        }
        
        return answer;
    }
}
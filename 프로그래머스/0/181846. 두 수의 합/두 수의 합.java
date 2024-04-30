class Solution {
    public String solution(String a, String b) {
        String answer = "";
        int a1 = a.length();
        int b1 = b.length();
        String [] a2 = a.split("");
        String [] b2 = b.split("");
        int c1 = 0;
        if (a1>b1)
            c1 = a1+1;
        else
            c1 = b1 + 1;
        int [] a3 = new int [a1];
        int [] b3 = new int [b1];
        for (int i = 0; i<a1; i++)
            a3[i] = Integer.parseInt(a2[a1-1-i]);
        for (int i = 0; i<b1; i++)
            b3[i] = Integer.parseInt(b2[b1-1-i]);
        
        int c3 [] = new int [c1];
        int d = 0;
        for (int i = 0; i<c1; i++){
            int aa = 0;
            int bb = 0;
            int s = 0;
            
            if (i<a1)
                aa = a3[i];
            if (i<b1)
                bb = b3[i];
            
            s = aa+bb + d;
            d= 0;
            if (s>9){
                d = 1;
                s = s-10;
            }
            c3[c1-1-i] = s;
            
        }
        if (c3[0] == 0){
            for (int i = 1; i<c1; i++)
                answer += c3[i] + "";
        }
        else{
            for (int i = 0; i<c1; i++)
                answer += c3[i] + "";
        }
        
        return answer;
    }
}
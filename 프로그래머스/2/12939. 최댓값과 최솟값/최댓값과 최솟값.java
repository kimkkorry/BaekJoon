class Solution {
    public String solution(String s) {
        String answer = "";
        String a [] = s.split(" "); 
        int min=Integer.parseInt(a[0]);
        int max=Integer.parseInt(a[0]);
        for (int i=1; i<a.length;i++){
            int b = Integer.parseInt(a[i]);
            if (min>b)
                min = b;
            if (max<b)
                max = b;
        }
        answer = min + " " + max;
        
        return answer;
    }
}
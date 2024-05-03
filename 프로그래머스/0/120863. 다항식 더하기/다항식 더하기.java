class Solution {
    public String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replaceAll("\\+", " ");
        String[] a = polynomial.split("   ");
        int b = 0;
        int c = 0;
        for (int i=0; i<a.length; i++){
            
            if (a[i].charAt(a[i].length()-1)-120 == 0){
                a[i] = a[i].replace("x", "");
                if (a[i].equals(""))
                    a[i] = "1";
                b += Integer.parseInt(a[i]);
            }
            else
                c+= Integer.parseInt(a[i]);
            
        }
        if (b!=0){
            if (b == 1){
                answer += "x";
            }
            else{
        answer += b+"";
        answer += "x";
            }
            }
        if (b!=0 && c!=0){
        answer += " + ";
        }
        if (c!=0)
        answer += c+"";
        return answer;
    }
}
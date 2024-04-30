class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        String [] a1 = bin1.split("");
        String [] a2 = bin2.split("");
        int a11 = 0;
        int a22 = 0;
        for (int i=0; i<a1.length;i++){
           if (a1[i].equals("1")){
                a11 += (int)(Math.pow(2,a1.length-i-1));
            }
        }
        for (int i=0; i<a2.length;i++){
            if (a2[i].equals("1")){
                a22 += (int)(Math.pow(2,a2.length-i-1));
            }
        }
        int a12 = a11+a22;
        
       answer = Integer.toBinaryString(a12);
        return answer;
    }
}
class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        while (s.length()!=1){
        	String sss = "";
            for (int i=0; i<s.length(); i++){
                if(s.charAt(i)-48==0)
                    answer[1] += 1;
                else
                    sss+= s.charAt(i)+"";
            }
            int ssss = sss.length();
            s = Integer.toBinaryString(ssss);
            answer[0] += 1;
            
            if (s.equals("1"))
                break;
        }
        return answer;
    }
}
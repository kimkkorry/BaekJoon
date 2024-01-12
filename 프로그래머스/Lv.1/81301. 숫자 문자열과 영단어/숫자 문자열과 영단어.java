class Solution {
    public int solution(String s) {
        String a = "";
        while(!s.equals("")){
            String b = s.substring(0,1);
            if (b.equals("z")){
                a+= "0";
                s = s.substring(4);
            }
            else if (b.equals("o")){
                 a+= "1";
                s = s.substring(3);
            }
            else if (b.equals("t")){
                String c = s.substring(0,3);
                if (c.equals("two")){
                    a+= "2";
                s = s.substring(3);
                }
                else{
                    a+= "3";
                s = s.substring(5);
                }
            }
            else if (b.equals("f")){
                String c = s.substring(0,3);
                if (c.equals("fou")){
                    a+= "4";
                s = s.substring(4);
                }
                else{
                    a+= "5";
                s = s.substring(4);
                }
            }
             else if (b.equals("s")){
             String c = s.substring(0,3);
                if (c.equals("six")){
                    a+= "6";
                s = s.substring(3);
                }
                else{
                    a+= "7";
                s = s.substring(5);
                }
             }
            else if (b.equals("e")){
             a+= "8";
                s = s.substring(5);
             }
             else if (b.equals("n")){
             a+= "9";
                s = s.substring(4);
             }
            else{
                a += b;
                s = s.substring(1);
            }
        }
        
        
        int answer = Integer.parseInt(a);
        return answer;
    }
}
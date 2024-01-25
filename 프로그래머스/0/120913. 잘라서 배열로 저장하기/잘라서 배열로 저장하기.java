class Solution {
    public String[] solution(String my_str, int n) {
        int a = my_str.length()/n;
        int b = my_str.length()%n;
        int c = a;
        if (b!=0)
            c+=1;
        String[] answer = new String [c];
        String [] aa = my_str.split("");
        int bb= 0;
        for (int i=0; i<my_str.length();i+=n){
            String aaa = "";
            for (int j = i;j<i+n;j++){
             
                if (j>=my_str.length())
                    break;
                aaa+= aa[j];
            }
            answer[bb] = aaa;
            bb+=1;
        }
        return answer;
    }
}
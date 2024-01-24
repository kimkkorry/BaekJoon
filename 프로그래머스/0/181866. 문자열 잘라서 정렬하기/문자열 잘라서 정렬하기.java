import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] a = myString.split("x");
        int b = 0;
        for (String aa : a){
            if (aa.equals(""))
                b+=1;
        }
        String[] answer =new String [a.length-b];
        int c = 0;
        for (int i=0; i<a.length;i++){
            if (!a[i].equals("")){
                answer[c] = a[i];
                c+=1;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
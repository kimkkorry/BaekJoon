import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a", "c");
        myStr = myStr.replaceAll("b", "c");
        String[] answer = myStr.split("c");
        ArrayList<String> a = new ArrayList<>();
        for (int i=0; i<answer.length;i++){
            if (!answer[i].equals(""))
            a.add(answer[i]);
        }
        a.remove("");
        if (a.size() == 0)
            a.add("EMPTY");
        String [] ans = new String[a.size()];
            ans = a.toArray(ans);
        return ans;
    }
}
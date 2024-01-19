import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] b = my_string.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for (int i=0;i<b.length;i++){
            if (!b[i].equals(" ")&&!b[i].equals(""))
                a.add(b[i]);
        }
        String[] answer = new String [a.size()];
        for (int i=0; i<a.size();i++)
            answer[i] = a.get(i);
        return answer;
    }
}
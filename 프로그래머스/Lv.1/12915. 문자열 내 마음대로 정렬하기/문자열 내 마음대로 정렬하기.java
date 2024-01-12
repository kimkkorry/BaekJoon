import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        ArrayList<String> b = new ArrayList<>();
        for (String str : strings)
            b.add(str);
        
        String[] a = new String[strings.length];
        for (int i=0; i<strings.length;i++)
            a[i] = strings[i].substring(n,n+1);
        
        Arrays.sort(a);
        
        String[] answer = new String[a.length];
        for (int i=0; i<a.length;i++){
            String c = "";
            for (int j=0; j<b.size();j++){
            if (b.get(j).substring(n, n+1).equals(a[i])){
                c = b.get(j);
                b.remove(c);
                break;
            }
                }
            answer[i] = c;
        }
        
        
        return answer;
    }
}
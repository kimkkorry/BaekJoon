class Solution {
    public int solution(String t, String p) {
        Long [] a = new Long[t.length()-p.length() + 1];
        int b = p.length();
        for (int i=0; i<a.length;i++){
            a[i] = Long.parseLong(t.substring(i,i+b));
        }
        Long c = Long.parseLong(p);
        
        int answer = 0;
        for (Long aa : a){
            if (aa<=c)
                answer +=1;
        }
        
        return answer;
    }
}
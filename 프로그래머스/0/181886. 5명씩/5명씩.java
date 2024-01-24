class Solution {
    public String[] solution(String[] names) {
        int a = 0;
        if (names.length%5==0)
            a = names.length/5;
        else
            a  = names.length/5+1;
        String[] answer = new String[a];
        int b = 0;
        for (int i=0; i<names.length;i+=5){
            answer[b] = names[i];
            b+=1;
        }
        
        return answer;
    }
}
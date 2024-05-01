class Solution {
    public String[] solution(String[] picture, int k) {
        int a = picture.length;
        int b = picture[0].length();
        String[] answer = new String [a*k];
        for(int i=0; i<a; i++){
            String [] aa = picture[i].split("");
            String bb = "";
            for (int j=0; j<b; j++)
                bb+= aa[j].repeat(k);
            for(int j = i*k; j<i*k+k; j++)
                answer[j] = bb;
        }
        
        return answer;
    }
}
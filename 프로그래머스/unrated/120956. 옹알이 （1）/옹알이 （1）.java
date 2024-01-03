class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
       String [] a = {"aya", "ye", "woo", "ma"};
        for (int i=0; i<babbling.length;i++){
            String b = babbling[i];
            for (int j=0; j<a.length;j++){
                if (b.contains(a[j]))
                  b = b.replaceAll(a[j], " " );
            }
            babbling[i] = b;
        }
        for(int i=0; i<babbling.length;i++){
            babbling[i] = babbling[i].replace(" ","");
            if (babbling[i].equals("" ))
                answer += 1;
        }
        
        return answer;
    }
}
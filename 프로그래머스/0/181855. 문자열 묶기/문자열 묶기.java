class Solution {
    public int solution(String[] strArr) {
        int a = 0;
        for (String str : strArr){
            if (str.length()>a)
                a = str.length();
        }
        int answer = 0;
        for (int i = 1; i<=a; i++){
            int b = 0;
            for (String str : strArr){
                if (i==str.length())
                    b +=1;
            }
            if (b>answer)
                answer = b;
        }
        
        return answer;
    }
}
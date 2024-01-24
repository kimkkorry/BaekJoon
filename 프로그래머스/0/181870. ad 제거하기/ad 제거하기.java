class Solution {
    public String[] solution(String[] strArr) {
        int a = 0;
        for (String str : strArr){
            if (str.contains("ad"))
                a += 1;
        }
        String[] answer = new String [strArr.length-a];
        int b = 0;
         for (int i=0; i<strArr.length;i++){
            if (strArr[i].contains("ad"))
                continue;
             else{
                 answer[b] = strArr[i];
                 b +=1;
             }
                 
        }
        return answer;
    }
}
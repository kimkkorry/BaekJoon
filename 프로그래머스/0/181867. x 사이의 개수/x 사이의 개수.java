class Solution {
    public int[] solution(String myString) {
        String a [] = myString.split("x");
        if (myString.substring(myString.length()-1).equals("x")){
            int[] answer = new int [a.length+1];
        for (int i=0; i<a.length;i++){
            answer[i] = a[i].length();
        }
            answer[a.length] = 0;
        return answer;
        }else{
        int[] answer = new int [a.length];
        for (int i=0; i<a.length;i++){
            answer[i] = a[i].length();
        }
        return answer;
        }
    }
}
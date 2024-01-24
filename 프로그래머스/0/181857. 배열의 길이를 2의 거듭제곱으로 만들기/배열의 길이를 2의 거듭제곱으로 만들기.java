class Solution {
    public int[] solution(int[] arr) {
        int a = 0;
        for(int i=0; i<arr.length;i++){
            if (Math.pow(2,i)==arr.length){
                a = arr.length;
            break;
            }
            else if(Math.pow(2,i)<arr.length&&Math.pow(2,i+1)>arr.length){
                a = (int)Math.pow(2,i+1);
                break;
            }
        }
        int[] answer = new int [a];
        for (int i=0; i<a;i++){
            if (i>=arr.length)
                answer[i] = 0;
            else
                answer[i] = arr[i];
        }
        return answer;
    }
}
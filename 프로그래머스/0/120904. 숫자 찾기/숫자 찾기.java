class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] a = (num+"").split("");
        for (int i=0; i<a.length;i++){
            if (a[i].equals(k+"")){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
class Solution {
    public int[][] solution(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        int c = 0;
        if (a>b)
            c = a;
        else
            c = b;
        int[][] answer = new int[c][c];
        for (int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}
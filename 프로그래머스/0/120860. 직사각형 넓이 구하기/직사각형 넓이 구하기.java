class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xmin = 257;
        int xmax = -257;
        int ymin = 257;
        int ymax = -257;
        for (int i = 0; i<4; i++){
            if (dots[i][0]<xmin)
                xmin = dots[i][0];
            if (dots[i][0]>xmax)
                xmax = dots[i][0];
            if (dots[i][1]<ymin)
                ymin = dots[i][1];
            if (dots[i][1]>ymax)
                ymax = dots[i][1];
        }
        answer = (Math.abs(xmax-xmin))*(Math.abs(ymax-ymin));
        return answer;
    }
}
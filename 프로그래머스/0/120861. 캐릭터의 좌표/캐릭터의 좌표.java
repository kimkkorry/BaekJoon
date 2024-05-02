class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int [2];
        int a = 0;
        int b = 0;
        int c = (board[0]-1)/2;
        int d = (board[1]-1)/2;
        
        for (int i=0; i<keyinput.length; i++){
            String e = keyinput[i];
            if (e.equals("left"))
                a -= 1;
            else if (e.equals("right"))
                a +=1;
            else if (e.equals("up"))
                b+=1;
            else if (e.equals("down"))
                b-=1;
            if (a>c)
            a = c;
        else if (a<-c)
            a = -c;
        if (b>d)
            b = d;
        else if (b<-d)
            b = -d;
        }
        
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}
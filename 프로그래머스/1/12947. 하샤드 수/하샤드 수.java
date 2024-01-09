class Solution {
    public boolean solution(int x) {
        String[] a = (x+"").split("");
        int aa = 0;
        for (String b : a)
            aa += Integer.parseInt(b);
        boolean answer = true;
        if (x%aa==0)
            answer = true;
        else
            answer = false;
        return answer;
    }
}
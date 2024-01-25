class Solution {
    public int solution(String my_string) {
        String [] a = my_string.split(" ");
        int answer = Integer.parseInt(a[0]);
        for (int i=1; i<a.length;i+=2){
            int b = Integer.parseInt(a[i+1]);
            if (a[i].equals("+"))
                answer += b;
            else
                answer -= b;
        }
        
        return answer;
    }
}
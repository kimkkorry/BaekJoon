class Solution {
    public int solution(int a, int d, boolean[] included) {
        int [] aa = new int [included.length];
        int b = 0;
        for (int i = a; i<a+d*included.length; i+=d){
           aa[b] = i;
            b+=1;
        }
        int answer = 0;
        for (int i=0; i<included.length;i++){
            if (included[i])
                answer+= aa[i]; 
        }
        return answer;
    }
}
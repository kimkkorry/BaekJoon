class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int a = 1;
        while(a!=0){
            for (int i=0; i<arr.length;i++){
                if (arr[i]>=50&&arr[i]%2==0){
                    arr[i] = arr[i]/2;
                    a+=1;
                }
                else if (arr[i]<50&&arr[i]%2==1){
                    arr[i] = arr[i]*2+1;
                    a+=1;
                }
            }
            if (a==1){
                a = 0;
                break;
            }
            else{
                a=1;
                answer +=1;
            }
        }
        
        return answer;
    }
}
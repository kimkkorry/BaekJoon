import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = -1;
        int a = 0;
        ArrayList<Integer> aa = new ArrayList<>();
        for (int i=0; i<nums.length;i++){
            for (int j=i+1; j<nums.length;j++){
                for (int k=j+1; k<nums.length;k++)
                  aa.add(nums[i]+nums[j]+nums[k]);
            }
        }
        for (Integer b : aa){
        int c = 0;
        for (int i=2; i<b; i++){
        if (b%i == 0)
        c+=1;
        }
        if (c==0)
        a+=1;
        }

    answer = a;
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i=0;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(arr[i]);
        i+=1;
        while (i < arr.length){
        if (i>=arr.length)
                break;
            else{
                if (a.size()>0){
            if (a.get(a.size()-1)<arr[i]){
            a.add(arr[i]);
            i+=1;
        }
            else
                a.remove(a.size()-1);
                }
                else{
                    a.add(arr[i]);
                    i+=1;
                }
                
            }
            
            }
        
        
        int[] stk = new int [a.size()];
        for (int j=0; j<a.size();j++)
            stk[j] = a.get(j);
        return stk;
    }
}
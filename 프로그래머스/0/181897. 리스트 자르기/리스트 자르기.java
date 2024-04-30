import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = 0;
        if (n==1){
            a = slicer[1]+1;
            int[] answer = new int [a];
            for (int i=0; i<a;i++)
                answer[i] = num_list[i];
        return answer;
        }
        else if (n==2){
            a = num_list.length - slicer[0];
           int[] answer = new int [a];
        for (int i=slicer[0]; i<num_list.length;i++)
            answer[i-slicer[0]] = num_list[i];
        return answer; 
        }
        else if (n==3){
            a = slicer[1] - slicer[0] +1 ;
           int[] answer = new int [a];
            for (int i= slicer[0]; i<=slicer[1];i++)
                answer[i-slicer[0]] = num_list[i];
        return answer; 
        }
        else{
        ArrayList<Integer>b = new ArrayList<>();
            for (int i=slicer[0]; i<=slicer[1]; i+=slicer[2])
                b.add(num_list[i]);
          int[] answer = new int [b.size()];
        for (int i=0; i<b.size();i++)
            answer[i] = b.get(i);
        return answer;  
        }
    }
}
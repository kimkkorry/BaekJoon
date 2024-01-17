class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] a = my_string.split("");
        for (int ind : index_list)
            answer += a[ind];
        return answer;
    }
}
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if (my_string.contains(is_prefix)){
            int a = is_prefix.length();
            String b = my_string.substring(0, a);
            if (b.equals(is_prefix))
                answer = 1;
        }
        return answer;
    }
}
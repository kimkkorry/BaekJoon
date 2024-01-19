class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i=0; i<targets.length;i++)
            answer[i] = count(keymap, targets[i]);
        
        return answer;
    }
    public int count(String[] keymap, String target){
        String[] a = target.split("");
        int count = 0;
        outer:
        for (String aa : a){
            int c = 0;
           int f = 0;
            for (int j=0;j<keymap.length;j++){
            	int d = 0;
                String[] b = keymap[j].split("");
                if (keymap[j].contains(aa)){
                    for (int i=0; i<b.length;i++){
                        if (aa.equals(b[i])) {
                            d+= i+1;
                        break;
                        }
                    }
                }
                if (c!=0){
                if (c>d&&d>0)
                    c = d;
                }
                else
                    c = d;
                if (d==0) {
                	f +=1;
                }
            }
            if (f == keymap.length){
            	count =0;
            	break outer;
            }
                count += c;
        }
        if (count ==0)
            count = -1;
        return count;
    }
}
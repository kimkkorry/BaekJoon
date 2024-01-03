class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int time = attacks[attacks.length-1][0];
        int hp = health;
        int tim = bandage[0];
        int splus = bandage[1];
        int aplus = bandage[2];
        int ttime = 0;
        for (int i=1; i<=time;i++){
            int hhp = hp;
            
            for (int j = 0; j<attacks.length;j++){
                if (i == attacks[j][0]){
                    hp -= attacks[j][1];
                    ttime = 0;
                }
                   
            }
            if (hp<=0){
                hp = -1;
                break;
            }
            
            if (hhp == hp){
                ttime += 1;
                hp += splus;
            }
            if (tim == ttime){
                hp += aplus;
                ttime = 0;
            }
                
            if (hp>health)
                hp = health;
            
        }
        answer = hp;
        
        return answer;
    }
}
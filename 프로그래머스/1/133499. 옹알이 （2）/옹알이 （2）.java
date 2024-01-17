class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i=0; i<babbling.length;i++){
            if (babbling[i].contains("aya"))
                babbling[i] = babbling[i].replaceAll("aya", "1");
              if (babbling[i].contains("ye"))
                babbling[i]=babbling[i].replaceAll("ye", "2");
              if (babbling[i].contains("woo"))
                babbling[i] = babbling[i].replaceAll("woo", "3");
             if (babbling[i].contains("ma"))
                babbling[i] = babbling[i].replaceAll("ma", "4");
        }
        for (String bab : babbling){
int b = 0;
            try{
                int test = Integer.parseInt(bab);
                String [] a = bab.split("");
                    b +=1;
                    for (int i=1; i<a.length;i++){
                        if (!a[i-1].equals(a[i]))
                            b +=1;
                    }
                   if (b == a.length)
                       answer +=1;
                
            
        }catch (Exception e){
            continue;
        }
            
            
        }
        
        return answer;
    }
}
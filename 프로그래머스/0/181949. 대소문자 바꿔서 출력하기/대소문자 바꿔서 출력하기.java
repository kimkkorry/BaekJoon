import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String [] aa = a.split("");
        for (int i=0; i<a.length();i++){
            if (a.charAt(i)-65>=0 && a.charAt(i)-65<=25)
                aa[i] = aa[i].toLowerCase();
            else
                aa[i] = aa[i].toUpperCase();
        }
        String b = "";
        for (int i=0; i<a.length();i++)
            b+=aa[i];
        System.out.print(b);
    }
}
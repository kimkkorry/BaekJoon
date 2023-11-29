import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);

String a = scanner.next();
String b = scanner.next();

String[] aa = a.split("");
String[] bb = b.split("");

String aaa = "";
String bbb = "";

for (int i=2; i>-1;i--) {
	aaa+=aa[i];
	bbb+=bb[i];
}

int aaaa = Integer.parseInt(aaa);
int bbbb = Integer.parseInt(bbb);

if (aaaa<bbbb)
	System.out.println(bbbb);
else
	System.out.println(aaaa);
}
}

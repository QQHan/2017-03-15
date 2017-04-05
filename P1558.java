import java.util.Scanner;


public class P1558 {
static Scanner cin=new Scanner(System.in);
public static void main(String[] args) {
	int n=cin.nextInt();
	while(n-->0){
		int x=cin.nextInt();
		int y=cin.nextInt();
		double p=1.0*y/x*100;
		System.out.printf("%.2f",p);
		System.out.println("%");
	}
}
}

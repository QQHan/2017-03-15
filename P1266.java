import java.util.Arrays;
import java.util.Scanner;

public class P1266 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while(cin.hasNext()){
		   int a=cin.nextInt();
		   int b=cin.nextInt();
		   int c=cin.nextInt();
		   if(a==b&&b==c&&a==-1)
			   break;
		   if(a<168)
			   System.out.println("CRASH "+a);
		   else if(b<168)
			   System.out.println("CRASH "+b);
		   else if(c<168)
			   System.out.println("CRASH "+c);
		   else
			   System.out.println("NO CRASH");
		} 
		cin.close();
	}
}

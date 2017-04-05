import java.util.Scanner;


public class P1211 {
  static  Scanner cin=new Scanner(System.in);
	public static void main(String[] args) {
		int m=cin.nextInt();
		 while(m-->0){
			 int n=cin.nextInt();
			 String xx=Integer.toBinaryString(n);
			 for(int i=0;i<32-xx.length();i++)
				 System.out.print("0");
		     System.out.println(xx);
		 }
		 cin.close();
	}
}

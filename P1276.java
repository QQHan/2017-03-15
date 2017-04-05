import java.util.Scanner;


public class P1276 {
   static Scanner cin=new Scanner (System.in);
   public static void main(String[] args) {
	while(cin.hasNext()){
		int f=cin.nextInt();
		double c= (5.0*(f-32)/9);
		System.out.printf("%.3f\n",c);
	}
	cin.close();
}
}

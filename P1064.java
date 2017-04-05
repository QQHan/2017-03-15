import java.util.Arrays;
import java.util.Scanner;

public class P1064 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while(cin.hasNext()){
		double n =cin.nextDouble();
		double area=0;
		area=Math.PI*n*n*n*4/3;
		System.out.printf("%.3f\n",area);
		} 
		cin.close();
	}
}

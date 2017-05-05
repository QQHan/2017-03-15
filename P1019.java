import java.util.Arrays;
import java.util.Scanner;
public class P1019 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(cin.hasNext()){
		int[] a=new int[4];
		a[0]=cin.nextInt();
		a[1]=cin.nextInt();
		a[2]=cin.nextInt();
		a[3]=cin.nextInt();
		Arrays.sort(a);
		System.out.print(a[0]+" ");
		System.out.print(a[1]+" ");
		System.out.print(a[2]+" ");
		System.out.println(a[3]);
		}
		cin.close();
	}
}
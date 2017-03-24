import java.util.Scanner;
public class P1040 {
	static Scanner cin=new Scanner(System.in);
     public static void main(String[] args) {
		int n=cin.nextInt();
		int sum=0;
		for(int i=1;i<=n;i+=2) 
				sum+=i;
		System.out.println(sum);
	}
}

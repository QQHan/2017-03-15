import java.util.Scanner;

public class P1244 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while(cin.hasNext()){
		   int a=cin.nextInt();
		   int sum=0;
	       for(int i=0;i<a;i++)
	    	   sum+=cin.nextInt();
	       System.out.println(sum);
		} 
		cin.close();
	}
}

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1056 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n=cin.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int sum=1;
		for(int i=0;i<n;i++){
			a[i]=cin.nextInt();
		}
		Arrays.sort(a);
		int result=a[0];
        b[0]=a[0];
		for(int i=1;i<n;i++){
			if(a[i]!=result){
				b[sum]=a[i];
				result=a[i];
		        sum++;
			}
		}
		cout.println(sum);
		for(int i=0;i<sum;i++){
			if(i!=sum-1){
			cout.print(b[i]+" ");
			}
			else{
				cout.print(b[i]);	
			}
		}
		cin.close();
		cout.close();
	}
}

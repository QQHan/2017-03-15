import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1075 {
	 static Scanner cin=new Scanner(System.in);
	 static PrintWriter cout=new PrintWriter(System.out);

	public static void main(String[] args) {
		 int num=1;
		 int result2=0;
		 int total=0;
		 int result=0;
		 int n=cin.nextInt();
		 int[] a=new int[n];
		 for(int i=0;i<n;i++){
			 a[i]=cin.nextInt();
		 }
		 Arrays.sort(a);
		 result=a[0];
		 for(int i=1;i<n;i++)
		 {
			 if(a[i]==result){
				 num++;
			 }
			 else{
				
				if(num>total)
				{
					total=num;
					num=1;
					result2=result;
				}
				result=a[i];
			 } 
		 }
		 cout.println(result2);
		 cout.println(total);
		 cin.close();
		 cout.close();
	}
	
}


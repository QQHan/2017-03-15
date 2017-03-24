import java.util.Arrays;
import java.util.Scanner;
public class P1113 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
         while(cin.hasNext()){
        	 int n=cin.nextInt();
        	 int m=cin.nextInt();
        	 if(m==n&& m==0)
        		 break;
        	 int[] a=new int[n+1];
        	 for(int i=0;i<n;i++){
        		 a[i]=cin.nextInt();
        	 }
        	 a[n]=m;
        	 Arrays.sort(a);
        	 for(int i=0;i<n;i++){
        		System.out.print(a[i]+" ");
        	 }
        	 System.out.println(a[n]);
         }
	}

}

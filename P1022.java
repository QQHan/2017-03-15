import java.util.Scanner;

public class P1022 {
	static Scanner cin = new Scanner(System.in);
     static int[] A=new int[41];
	public static void fib(){
    	A[0]=1;
    	A[1]= 1;
    	for(int total=2;total<40;total++){
    		A[total]=A[total-1]+A[total-2];
    	}
    }
	public static void main(String[] args) {
		fib();
		while (cin.hasNext()) {
			 int n=cin.nextInt();
			 for(int i=0;i<n-1;i++){
				 System.out.print(A[i]+" ");
			 }
			 System.out.print(A[n-1]);
		}
		cin.close();
	}
}

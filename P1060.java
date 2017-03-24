import java.util.Arrays;
import java.util.Scanner;
public class P1060 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while (cin.hasNext()) {	 
			int n = cin.nextInt();
			if (n == 0)
				break;
			int[] A = new int[n];
			int[] B = new int[n];
			int[] C = new int[n];
			for (int i = 0; i < n; i++) {
				A[i] = cin.nextInt();
				B[i] = Math.abs(A[i]);
			}
			Arrays.sort(B);
			for (int i=0;i<n;i++){
				 for(int j=0;j<n;j++){
					 if(Math.abs(A[j])==B[i])
						C[n-1-i]=A[j]; 		
				 }
			}
			for (int k = 0; k < n - 1; k++) {
				System.out.print(C[k] + " ");
			}
			System.out.println(C[n - 1]);
		}
	}

}

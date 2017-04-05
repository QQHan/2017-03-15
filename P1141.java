import java.util.Arrays;
import java.util.Scanner;
public class P1141 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if(n==0)
				break;
			int[] ran = new int[n];
			for (int i = 0; i < n; i++)
				ran[i] = cin.nextInt();
			Arrays.sort(ran);
			int[] a = new int[n];
			int sum=0;
			int result=ran[0];
			for(int k=1;k<n;k++){
				if(ran[k]==result)
					continue;
				else{
					a[sum]=result;
					result=ran[k];
					sum++;
				}
			}
			System.out.println(sum+1);
			for(int key=0;key<sum;key++)
				System.out.print(a[key]+" ");
			System.out.print(result+"\n\n");
		}
		cin.close();
	}
}

import java.util.Scanner;

public class P1008 {
	static Scanner cin = new Scanner(System.in);
    static long valid(int n,int k){
    	if(n==1)return k-1;
    	if(n==2)return k*(k-1);
    	return (valid(n-1,k)+valid(n-2,k))*(k-1);
    }
	public static void main(String[] args) {
		 int n,k;
		 while(cin.hasNext()){
			 n=cin.nextInt();
			 k=cin.nextInt();
			 long sum=valid(n,k);
			 System.out.println(sum);
		 }
		 cin.close();
	}
}

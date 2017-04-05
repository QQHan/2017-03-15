import java.util.Scanner;


public class P1135 {
static Scanner cin=new Scanner (System.in);
	public static void main(String[] args) {
		 while(cin.hasNext()){
			 int v=cin.nextInt();
			 int d=cin.nextInt();
			 int n=0;
			 while(d*n*(n+1)<2*v){
				 n++;
			 }
			 if(v%d==0)
				 System.out.println(v/d+n-1);
			 else
				 System.out.println(v/d+n);
		 }
         cin.close();
	}

}

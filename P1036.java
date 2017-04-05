import java.util.Scanner;
public class P1036 {
    static Scanner cin=new Scanner(System.in);
	public static void main(String[] args) {
       while(cin.hasNext()){
    	   int n=cin.nextInt();
    	   float sum=100;
    	   float xx=100;
    	   while(n-->1){
    		   sum+=xx;
    		   xx/=2;
    	   }
    	   System.out.printf("%.4f\n",sum);
       }
	}

}

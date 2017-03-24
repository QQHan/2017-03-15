import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class P1289 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

  public static void main(String[] args) {
	  int sum=0;
	  int i=0;
	  int min=0xffffff;
	  int max=-0xffffff;
	  while(cin.hasNext()){
	     int n=cin.nextInt();
	     if(n>max)
	    	 max=n;
	     if(n<min)
	    	 min=n;
	     sum+=n;
	     i++;
	  }
	  cout.print(min+" ");
	  cout.print(max+" ");
	  cout.printf("%.3f\n",1.0*sum/i);
	  cin.close();
	  cout.close();
  }	
}

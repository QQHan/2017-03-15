import java.io.PrintWriter;
import java.util.Scanner;

public class P1213 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNextLine()) {
		   String s=cin.nextLine();
	       int n=Integer.parseInt(s);
	       if(s.contains("0")){
	    	   cout.println("Unlucky");
	       }
	       else{
	    	  if(n<10){
	    		  cout.println(n);
	    	  }
	    	  else{
	    		  cout.println(n-n/10);
	    	  }
	       }
		}
		cin.close();
		cout.close();
	}
}

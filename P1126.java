import java.io.PrintWriter;
import java.util.Scanner;


public class P1126 {
  static Scanner cin=new Scanner(System.in);
  static PrintWriter cout=new PrintWriter(System.out);
  public static void main(String[] args) {
	while(cin.hasNext()){
		StringBuffer buffer=new StringBuffer(cin.next());
		String buffer1=new String(buffer.toString());
		String buffer2=new String(buffer.reverse().toString());
		if(buffer1.equals(buffer2)){
			cout.println("Y");
		}
		else{
			cout.println("N");
		}
	}
	cin.close();
	cout.close();
}
}

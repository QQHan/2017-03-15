import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;

public class P1284 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		Calendar calendar =Calendar.getInstance();
		calendar.set(cin.nextInt(),Calendar.DECEMBER,31);
		if(calendar.get(Calendar.DAY_OF_YEAR)==366){
			cout.println("yes");
		}
		else{
			cout.println("no");
		}
		cin.close();
		cout.close();
	}
}

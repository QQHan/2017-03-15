import java.util.Scanner;
public class P1017 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(cin.hasNextLine()){
			StringBuffer s=new StringBuffer(cin.nextLine().trim());
			System.out.print(s);
			System.out.println(s.reverse());
		}
		cin.close();
	}
}

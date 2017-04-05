import java.util.Scanner;

public class P1315 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
			String s = cin.next();
			int num = 0;
			char temp = s.charAt(0);
			for (int i = 0; i < s.length(); i++) {
				if (temp == s.charAt(i)) {
					num++;
				}else {
					System.out.print(num);
					System.out.print(temp);
					temp = s.charAt(i);
					num = 1;
				}
				if(i==s.length()-1){
					System.out.print(num);
					System.out.print(temp);
				}
			}
			System.out.print("\n");
		}
		cin.close();
	}
}

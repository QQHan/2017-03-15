import java.util.Scanner;

public class P1112 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
            StringBuffer s=new StringBuffer();
            int c=cin.nextInt();
            s.append(String.valueOf(c));
			for(int i=1;i<9;i++){
				int x=cin.nextInt();
				if(x>c)
					s.append(" "+String.valueOf(x));
				else
					s=new StringBuffer(String.valueOf(x).concat(" "+s.toString()));
			}
			for(int k=0;k<s.length();k++)
				System.out.print(s.charAt(k));
			System.out.print("\n");
		}
		cin.close();
	}
}

import java.util.Scanner;

public class P1098 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			String s=cin.next().trim();
			StringBuffer ss=new StringBuffer();
			int step=0;
			for (int i = 0;i<n;i++) {
				 if(!ss.toString().contains(s.substring(i,i+1)))
					ss.append(s.charAt(i)); 
			}
			step=ss.length();
			int up=1;
			int down=1;
			for(int j=0;j<step;j++)
				up*=n-j;
			for(int k=1;k<=step;k++)
				down*=k;
			System.out.println(up/down);
		}
		cin.close();
	}
}

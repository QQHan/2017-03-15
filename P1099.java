import java.util.Scanner;

public class P1099 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		int n =Integer.valueOf(cin.nextLine().trim());
		while (n-- > 0) {
			String s = cin.nextLine().trim();
			int[] A=new int[3];
			char a[] = new char[3];
			a = s.toCharArray();
			for (int i = 0; i < a.length; i++){
				A[i]=Integer.valueOf(a[i]);
			}
			int x=A[0]-96;
			int y=A[1]-48;
			
			if(x>=3&&x<=6&&y>=3&&y<=6){
				System.out.println("8");
			}else if(x==1&&y>=3&&y<=6||x==8&&y>=3&&y<=6||y==1&&x>=3&&x<=6||y==8&&x>=3&&x<=6||x==2&&y==2||x==7&&y==2||x==7&&y==7||x==2&&y==7){
				System.out.println("4");
			}else if(x==1&&y==2||x==1&&y==7||y==1&&x==2||y==8&&x==2||y==1&&x==7||y==8&&x==7||y==2&&x==8||y==7&&x==8){
				System.out.println("3");
			}else if(x==1&&y==1||x==8&&y==1||x==1&&y==8||x==8&&y==8){
				System.out.println("2");
			}else{
				System.out.println("6");
			}
		}
		cin.close();
	}
}
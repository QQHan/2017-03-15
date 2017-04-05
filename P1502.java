import java.util.Scanner;
public class P1502 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
         while(cin.hasNext()){
        	 int n=cin.nextInt();
        	 int m=cin.nextInt();
        	 long tot=0;
        	 long temp=0;
        	 StringBuffer s=new StringBuffer();
        	 for(int i=0;i<m;i++){
        		 temp=Long.valueOf(s.append(n).toString().trim());
        		 tot+=temp;
        	 }
        	 System.out.println(tot);
         }
	}
}

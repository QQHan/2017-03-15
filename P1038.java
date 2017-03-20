import java.io.PrintWriter;
import java.util.Scanner;

public class P1038 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int total=0;
			int result=cin.nextInt();
			while(result!=1){
				if(result%2==0){
					cout.println(result+"/"+"2"+"="+result/2);
					result/=2;
				}
				else{
					total=result*3+1;
					cout.println(result+"*"+"3"+"+"+"1"+"="+total);
					result=total;
				}
				
			}
			
		}
		cin.close();
		cout.close();
	}
}



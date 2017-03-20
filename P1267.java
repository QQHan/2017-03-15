import java.io.PrintWriter;
import java.util.Scanner;

public class P1267 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNextLine()){
			StringBuffer s=new StringBuffer(cin.nextLine());
			StringBuffer s1=new StringBuffer();
			if(s.toString().equals("END")){
                break;
			}
			else{
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)=='A'||s.charAt(i)=='W'||s.charAt(i)=='F'){
						s1.append("I");
					}
					else if(s.charAt(i)=='D'||s.charAt(i)=='P'||s.charAt(i)=='G'||s.charAt(i)=='B'){
						s1.append("e");
					}
					else if(s.charAt(i)=='L'){
						s1.append("Y");
					}
					else if(s.charAt(i)=='X'){
						s1.append("u");
					}
					else if(s.charAt(i)=='C'){
						s1.append("L");
					}
					else if(s.charAt(i)=='M'){
						s1.append("o");
					}
					else if(s.charAt(i)=='S'){
						s1.append("v");
					}
					else{
						s1.append(s.charAt(i));
					}
				}
				cout.println(s1);
			}
		}
		cin.close();
		cout.close();
	}
}

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1516 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
     
	public static void main(String[] args) {
		while(cin.hasNextLine()){
			int[] Doater=new int[6];
			int[] Loler=new int[4];
			String s1=new String(cin.nextLine());
			String s2=new String(cin.nextLine());
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)=='d'||s1.charAt(i)=='D'){
					Doater[0]++;
				}
				else if(s1.charAt(i)=='o'||s1.charAt(i)=='O'){
					Doater[1]++;
				}
				else if(s1.charAt(i)=='a'||s1.charAt(i)=='A'){
					Doater[2]++;
				}
				else if(s1.charAt(i)=='t'||s1.charAt(i)=='T'){
					Doater[3]++;
				}
				else if(s1.charAt(i)=='e'||s1.charAt(i)=='E'){
					Doater[4]++;
				}
				else{
					Doater[5]++;
				}
			}
			Arrays.sort(Doater);
			int doater=Doater[0];
			for(int i=0;i<s2.length();i++){
				if(s2.charAt(i)=='l'||s2.charAt(i)=='L'){
					Loler[0]++;
				}
				else if(s2.charAt(i)=='o'||s2.charAt(i)=='O'){
					Loler[1]++;
				}
				else if(s2.charAt(i)=='e'||s2.charAt(i)=='E'){
					Loler[2]++;
				}
				else{
					Loler[3]++;
				}
			}
			Loler[0]=Loler[0]/2;
			Arrays.sort(Loler);
			int loler=Loler[0];
			cout.println("Dotaer: "+doater);
			cout.println("Loler: "+loler);
			if(loler>doater*3){
				cout.println("Loler win");
			}
			else{
				cout.println("Dotaer win");
			}
		}
		cin.close();
		cout.close();
	}
}

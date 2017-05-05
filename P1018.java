import java.util.Scanner;
public class P1018 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(cin.hasNext()){
			int s=cin.nextInt();
			int total=(int) Math.pow(s, 3);
			int start=s*(s-1)+1;
			int sum=start;
			System.out.print(s+"*"+s+"*"+s+"="+total+"="+start);
			total=total-start;
			start+=2;
			for(;;start+=2){
				if(sum>total)
					break;
				sum+=start;
				System.out.print("+"+start);
			}
		System.out.print("\n");
		}	
		cin.close();
	}
}
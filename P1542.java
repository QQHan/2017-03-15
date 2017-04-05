import java.util.Scanner;
public class P1542 {
   static Scanner cin=new Scanner(System.in);
   public static void main(String[] args) {
	while(cin.hasNext()){
		int n=cin.nextInt();
		int k=cin.nextInt();
		float index=(float) (1+0.01*k);
		int i;
		float salary=n;
		float price=200;
		for(i=1;i<20;i++){
			if(salary>=price)
				break;
			else{
				salary+=n;
				price*=index;
			}
		}
		if(i==20)
			System.out.println("Impossible");
		else
			System.out.println(i);
	}
	cin.close();
}
}

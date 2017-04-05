import java.util.Scanner;


public class P1238 {
	
	static Scanner cin=new Scanner(System.in);
	public static int salary(int money){
		int sum=0;
		while(money>0){
			if(money>=100){
				int h=money/100;
				sum+=h;
				money=money%100;
			}else if(money>=50&&money<100){
				sum++;
				money-=50;
			}else if(money<50&&money>=10){
				int s=money/10;
				sum+=s;
				money=money%10;
			}else if(money>=5&&money<10){
				sum++;
				money-=5;
			}else if(money>=2&&money<5){
				int e=money/2;
				sum+=e;
				money-=e*2;
			}else{
				sum++;
				money--;
			}
		}
		return sum;
	}
public static void main(String[] args) {
	while(cin.hasNext()){
		int n=cin.nextInt();
		if(n==0)
			break;
		int tot=0;
		for(int i=0;i<n;i++){
			int temp=cin.nextInt();
			tot+=salary(temp);
		}
		System.out.println(tot);
	}
	cin.close();
}
}

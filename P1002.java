import java.util.Scanner;
public class P1002 {
    static Scanner cin=new Scanner(System.in);
	public static void main(String[] args) {
		 while(cin.hasNext()){
			 int a=cin.nextInt();
			 int b=cin.nextInt();
			 int c=cin.nextInt();
			 double x1=0;
			 double x2=0;
			 if(a==0){
				 if(b==0){
					 System.out.println("解不存在");
				 }else{
					 x1=x2=-(1.0*c/b);
					 System.out.printf("%.2f%.2f\n",x1,x2); 
				 }
			 }else{
				 double temp=1.0*(b*b-4*a*c);
				 if(temp<0){
					 System.out.println("无解");
				 }
				 else{
					 double s=Math.sqrt(temp);
					 x1=(s-b)/2/a;
					 x2=(-s-b)/2/a;
					 System.out.printf("%.2f %.2f\n",x1,x2);
				 }
			 }
		 }
	}
}

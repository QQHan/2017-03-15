import java.io.PrintWriter;
import java.util.Scanner;

public class P1259 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	static class Stu {
		String name;
		double english;
		double poltic;
		double math;
		double profession;
		double grade;
		double sum;
		double total;
	}

	public static void main(String[] args) {
		double e=cin.nextDouble(),po=cin.nextDouble(),m=cin.nextDouble(),pr=cin.nextDouble(),t=cin.nextDouble();
		//cout.print(e+" "+po+" "+m+" "+pr+" "+t+" ");
		while(cin.hasNextLine()){
			StringBuffer s=new StringBuffer();
			Stu stu = new Stu();
			stu.name=cin.next();
			stu.english=cin.nextDouble();
			stu.poltic=cin.nextDouble();
			stu.math=cin.nextDouble();
			stu.profession=cin.nextDouble();
			stu.grade=cin.nextDouble();
			stu.sum=stu.english+stu.math+stu.poltic+stu.profession;
			stu.total=(stu.sum*0.6+stu.grade*0.4);
			//cout.println(stu.name+" "+stu.english+" "+stu.math+" "+stu.poltic+" "+stu.profession+" "+stu.grade+" "+stu.total+" ");
//			if(stu.english >= e && stu.math >= m && stu.poltic >= po && stu.profession >= pr &&  stu.total >= t && stu.grade >= 60){
//				s.append("1");
//				//cout.println(stu.name+" "+stu.sum+" "+stu.grade+" "+stu.total+" ");
//			}
//			else{
//				s.append("0");
//			}
			if(stu.english >= e){
				s.append("1");
			}
			else{
				s.append("0");
			}
			 if(stu.math >= m){ 
					s.append("1");
			}
			 else{
					s.append("0");
				}
			 if(stu.poltic >= po ){
				 s.append("1");
			}
			 else{
					s.append("0");
				}
			if(stu.profession >= pr ){
				s.append("1");
			}
			else{
				s.append("0");
			}
			if(stu.total >= t ){
				s.append("1");
			}
			else{
				s.append("0");
			}
			if(stu.grade >= 60){
				s.append("1");
			}
			else{
				s.append("0");
			}
			if(!s.toString().contains("0")){
				cout.println(stu.name+" "+stu.sum+" "+stu.grade+" "+stu.total+" ");
			}
		}
		cin.close();
		cout.close();
	}
}

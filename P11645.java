import java.util.Scanner;
import java.util.Vector;


public class P11645 {
    static Scanner cin=new Scanner(System.in);
    
    static class Quee{
    	Vector<String> q=new Vector<String>();
    	public Quee(){
    		for(int i=0;i<10;i++)
    			q.add("0");
    	}
    public void enqueue(String s){
    		if(q.size()<10)
    			q.add(s);
    		else{
    			q.remove(0);
    			q.add(s);
    		}
    	}
    }
    
	public static void main(String[] args) {
        Quee queue[]=new Quee[3];
        for(int i=0;i<3;i++) 
        	queue[i]=new Quee();
        while(cin.hasNext()){
        	int index=cin.nextInt();
        	String tel=cin.next();
        	queue[index].enqueue(tel);
        }
       for(int i=0;i<10;i++)
    	   System.out.println(String.format("%s %s %s", queue[0].q.get(i),queue[1].q.get(i),queue[2].q.get(i)));
       cin.close();
	}

}

import java.io.PrintWriter;
import java.util.Scanner;
 
public class P1126{
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
      
    public static void main(String[] args) {
        while (cin.hasNextLine()) {
            StringBuffer sb=new StringBuffer();
            String s = new String(cin.nextLine());
            char[] a=s.toCharArray();
            char max=a[0];
            for(int i=0;i<a.length;i++){
                if(a[i]>max){
                    max=a[i];
                }
            }
            for(int j=0;j<a.length;j++){
                if(a[j]==max){
                    sb.append(a[j]+"(max)");
                }
                else{
                    sb.append(a[j]);
                }
            }
            cout.println(sb);
        }
        cin.close();cout.close();
    }
}
import java.util.Scanner;
import java.util.Arrays;
public class P1221{
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        while (cin.hasNext()) {
            String s=cin.nextLine().trim();
            String[] ss=s.split(" ");
            System.out.println(ss.length);
            Arrays.sort(ss,0,ss.length);
            String[] c_s=new String[ss.length];
            int[] a=new int[ss.length];
            c_s[0]=ss[0];
            a[0]=1;
            int j=0;
            for (int i = 1; i<ss.length; i++) {
                  if(ss[i].equals(ss[i-1]))
                      a[j]++;
                  else{
                	  j++;
                      a[j]++;
                      c_s[j]=ss[i];
                  }
            }
            for(int k=0;k<=j;k++){
                 System.out.println(c_s[k]+":"+a[k]);
            }
        }
        cin.close();
    }
}

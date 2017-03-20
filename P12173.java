import java.math.BigInteger;
import java.util.Scanner;

public class P12173 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		String sum = null;
		StringBuffer sb = new StringBuffer().append(str);
		String[] arr = sb.toString().split("\\+");
		StringBuffer sb1 = new StringBuffer().append(arr[0].trim());
		StringBuffer sb2 = new StringBuffer().append(arr[1].trim());
		String str1 = Integer.valueOf(sb1.toString(), 2).toString();
		String str2 = Integer.valueOf(sb2.toString(), 2).toString();
		if (sb.toString().contains("+")) {
			sum = new BigInteger(str1).add(new BigInteger(str2)).toString();
		} else if (sb.toString().contains("-")) {
			sum = new BigInteger(str1).subtract((new BigInteger(str2)))
					.toString();
		}
		int n = Integer.parseInt(sum);
		System.out.println(Integer.toBinaryString(n));
	}
}
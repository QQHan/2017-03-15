import java.util.Scanner;

public class P11642 {
	static Scanner cin = new Scanner(System.in);
	 static class Mstack{
	  int maxSize;
	  String[] stackArray;
	  int top;

	public Mstack(int s) {
		maxSize = s;
		stackArray = new String[maxSize];
		top = -1;
	}

	public void push(String j) {
		stackArray[++top] = j;
	}

	public String pop() {
		return stackArray[top--];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	}
	public static void main(String[] args) {
		Mstack stack0=new Mstack(1000);
		Mstack stack1=new Mstack(1000);
		Mstack stack2=new Mstack(1000);
		int n = 10;
		while (cin.hasNext()) {
			int signal = cin.nextInt();
			String tel = cin.next();
			switch (signal) {
			case 0:
				stack0.push(tel);
				break;
			case 1:
				stack1.push(tel);
				break;
			case 2:
				stack2.push(tel);
				break;
			}
		}
		while (n-- > 0) {
			if (!stack0.isEmpty()) {
				System.out.print(stack0.pop() + " ");
			} else {
				System.out.print("0" + " ");
			}
			if (!stack1.isEmpty()) {
				System.out.print(stack1.pop() + " ");
			} else {
				System.out.print("0" + " ");
			}
			if (!stack2.isEmpty()) {
				System.out.println(stack2.pop());
			} else {
				System.out.println("0");
			}
		}
	}
}

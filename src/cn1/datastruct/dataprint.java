package cn1.datastruct;

public class dataprint {
	public static void main(String[] args) {
        f1(5);
	}
	public static void f1(int n) {
		if(n == 1) {
			System.out.println(1);
		} else {
			f1(n-1);
			StringBuilder str = new StringBuilder();
			for(int i = 0; i < n; i++) {
				str.append(n + " ");
			}
			System.out.println(str);
		}
	}
	public static long fibonacci(int n) {
		if(1 == n || 0 == n) {
			return n;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}

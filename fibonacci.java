
public class fibonacci {

	public int fib(int index) {
		if (index == 0) {
			return 0;
		}
		if (index == 1 || index == 2) {
			return 1;
		}
		return fib(index-2) + fib(index-1);
	}
	
	public static void main(String[] args) {
		fibonacci f = new fibonacci();
		System.out.println("The first 40 fibonacci numbers are:");
		for (int t = 1; t < 41; t++) {
		System.out.println("Fibonacci number " + t + " is " + f.fib(t));
		}
	}

}

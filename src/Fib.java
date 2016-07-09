
public class Fib {
	public static void main(String[] args) {
		int back2 = 1;
		int back1 = 1;
		int corrent;
		for (int i = 1; i < 11; i++) {
			corrent = back2 + back1;
			System.out.println(corrent);
			back2 = back1;
			back1 = corrent;
		}
	}
}

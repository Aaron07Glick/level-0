
public class fizzbuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 21; i++) {
			if (i%15==0) {
				System.out.println("fizbuzz");
			}
			else if (i%3==0){
				System.out.println("fiz");
			}
			else if (i%5==0){
				System.out.println("buzz");
			}
			else System.out.println(i);
		}

	}
}

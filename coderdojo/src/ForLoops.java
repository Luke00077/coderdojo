
public class ForLoops {

	public static void main(String[] args) {
		// for (initialize; condition; updation) {
		for (int x = 0; x < 10; x = x + 2) {
			System.out.println("Hello world!");

		}
		for (int y = 0; y <= 10; y = y + 2) {
			System.out.println(y);
		}
		for (int z = 0; z <= 50; z = z + 5) {
			System.out.println(z);
			if (z % 2 == 0) {
				System.out.println("It is even.");
			} else {
				System.out.println("It's odd.");
			}
		}
	}
}

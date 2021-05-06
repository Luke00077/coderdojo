package tables;

public class Tables {

	public static void main(String[] args) {

		Tables tables = new Tables();

		tables.printTenMultiples(3, 9);
		tables.printTenMultiples(4, 16);

	}

	public void printTenMultiples(int x, int y) {
				System.out.println("Multiples of " + x + " until " + y);
		for (int number = 0; number <= y; number = number + x) {
				System.out.println(number);
		}

	}
}

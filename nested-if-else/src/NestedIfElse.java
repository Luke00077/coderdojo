
public class NestedIfElse {

	public static void main(String[] args) {

		int temperature = 84;
		boolean warm = false;
		if (temperature > 85) {
			System.out.println("It's hot outside.");
			if (warm == true)
				System.out.println("It's also sunny outside.");
			else
				System.out.println("It's also a little cloudy outside.");
		} else {
			System.out.println("It is not that hot outside.");
		}

	}

}

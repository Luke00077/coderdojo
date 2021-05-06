
public class SwitchCases2 {
	
	public static void main(String[] args) {
		SwitchCases2 switchcases = new SwitchCases2();
		switchcases.switches(5);
		switchcases.switches(4);
		switchcases.switches(3);
		switchcases.switches(2);
		switchcases.switches(1);
	
	}

	public void switches(int age) {
		switch (age) {
		

		case 1:
			System.out.println("You might've said your first word but you cannot walk");
			break;
		case 2:
			System.out.println("You can somewhat talk and walk!");
			break;
		case 3:
			System.out.println("You can talk real well, and you can write and doodle!");
			break;
		case 4:
			System.out.println("You go to school next year and you're socially active!");
			break;
		default:
			System.out.println("I don't know how old you are!");
			break;

		}
	}
}

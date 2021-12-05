import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("0.Exit");
			System.out.println("*******************");
			System.out.println("Enter your choice");
			System.out.println("*******************");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			if (choice == 0)
				break;

			System.out.println("Enter first number");
			int n1 = sc.nextInt();
			System.out.println("Enter second number");
			int n2 = sc.nextInt();
			
			System.out.println("*******************");
			switch (choice) {
			case 1:
				System.out.println("Addition result is: " + (n1 + n2));
				break;
			case 2:
				System.out.println("Subtraction result is: " + (n1 - n2));
				break;
			case 3:
				System.out.println("Multiplication result is: " + (n1 * n2));
				break;
			case 4:
				System.out.println("Division result is: " + (n1 / n2));
				break;
			default:
				break;
			}
			System.out.println("*******************\n");
		} while (choice != 0);
	}
}
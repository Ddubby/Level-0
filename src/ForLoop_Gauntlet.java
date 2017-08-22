
public class ForLoop_Gauntlet {
	public static void main(String[] args) {
		// Problems not listed already completed
		// Problem 5
		// "syso" (Shortcut) equals print in console
		// Variable%Variable equals Variable divide by Variable
		for (int i = 1; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			} else {
				System.out.println(i + " odd");
			}

		}
		// Problem 7
		int age = 2004;
		for (int i = 0; i < 13; i++) {
			System.out.println("In " + age++ + ", I was " + i + " years old");

		}
		// Nested Loops
		// Problem 1
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.println(i + " " + j);

			}
		}
		// Problem 2
		// Command "\n" creates new line
		// syso, without the "ln", doesn't create a new line
		for (int i = 1; i < 10; i += 3) {

			for (int j = 0; j < 3; j++) {

				System.out.print((i + j) + " ");

			}
			System.out.print("\n");
		}

		// Problem 3
		for (int i = 1; i < 101; i+=10) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println("\n");
		}
		// Problem 4
	for (int i = 1; i < 8; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
	System.out.println("\n");
	}
	
	
	
	
	
	}
}

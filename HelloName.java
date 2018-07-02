package homeTask3;

import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		System.out.println("Ënter Your Name:");
		Scanner scanner = new Scanner(System.in);
		String Name = scanner.next();
		System.out.println("Hello, " + Name);
		scanner.close();
	}

}

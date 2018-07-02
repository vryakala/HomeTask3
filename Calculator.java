package homeTask3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("**********************************************");
		System.out.println("Operation			Operant used");
		System.out.println("**********************************************");
		System.out.println("Addition				add");
		System.out.println("Subtraction				sub");
		System.out.println("multiplication				mul");
		System.out.println("division				div");
		System.out.println("reminder				rem");
		System.out.println("percentage				percent");
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Operation you want to perform : ");
		String operation = scanner.next();
		if (operation.equals("add") || operation.equals("sub") || operation.equals("sub") || operation.equals("mul")
				|| operation.equals("div") || operation.equals("rem") || operation.equals("percent")) {
			System.out.println("Enter First Number:");
			float a = scanner.nextFloat();
			System.out.println("Enter Second Number:");
			float b = scanner.nextFloat();
			scanner.close();
			float Result = 0;
			switch (operation) {
			case "add":
				Result = a + b;
				break;
			case "sub":
				Result = a - b;
				break;
			case "mul":
				Result = a * b;
				break;
			case "div":
				Result = a / b;
				break;
			case "rem":
				Result = a % b;
				break;
			case "percent":
				Result = (a / b) * 100;
				break;
			}
			System.out.println("Result of your " + operation + " : " + Result);
		} else {
			System.out.println("Please enter a valid operation");
		}

	}
}

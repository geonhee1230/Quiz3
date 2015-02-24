package quiz3;

import java.util.Scanner;

public class Quiz3 {

	static int[] a;

	public static void main(String[] args) {

		createArray();
		
		System.out.println("Ascending order :");
		sortAscending(a);
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println("");
		System.out.println("Descending order :");

		sortDescending(a);

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

	}

	public static int[] createArray() {

		System.out.println("Please enter the number of inputs :");
		Scanner keyboard = new Scanner(System.in);
		int inputs = keyboard.nextInt();
		a = new int[inputs];
		System.out.println("Please enter up to " + inputs + " numbers : ");
		for (int i = 0; i < a.length; i++)
			a[i] = keyboard.nextInt();
		return a;
	}

	public static int[] sortAscending(int[] g) {

		for (int x = 0; x < a.length; x++) {
			int lowest = a[x];
			for (int i = x + 1; i < a.length; i++) {
				if (a[i] < lowest) {
					lowest = a[i];
					int temp = a[x];
					a[x] = lowest;
					a[i] = temp;
				}
			}
		}
		return a;
	}

	public static int[] sortDescending(int[] g) {

		for (int x = 0; x < a.length; x++) {
			int highest = a[x];
			for (int i = x + 1; i < a.length; i++) {
				if (a[i] > highest) {
					highest = a[i];
					int temp = a[x];
					a[x] = highest;
					a[i] = temp;
				}
			}
		}
		return a;
	}

}

package com.logicalprogram.starpattern;

public class StarPattern10 {

	public static void pattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2 logic
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		pattern(n);
	}

}

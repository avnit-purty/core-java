package com.logicalprogram.starpattern;

import java.util.Scanner;

public class StarPttern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
		 * for(int i=1;i<=num;i++) { for(int j=num;j>=i;j--) { System.out.print(" "); }
		 * for(int k=1;k<=i;k++) { if(k==1||k==i||i==num) { System.out.print("*");
		 * 
		 * }else { System.out.print(" "); }
		 * 
		 * 
		 * } System.out.println();
		 */
		/////// 2nd logic////
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				if (j == num || j == i || i == 1) {

					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		sc.close();
		}
	
	}
}


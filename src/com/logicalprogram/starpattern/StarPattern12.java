
package com.logicalprogram.starpattern;

import java.util.Scanner;

public class StarPattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
		 * for (int i = 1; i <= num; i++) { for (int j = 1; j <= i; j++) {
		 * //System.out.print(j); if (j == 1 || j == i || i == num) {
		 * System.out.print("*"); } else { System.out.print(" "); }
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--) {
				if(k==num||k==i||i==1) {
				System.out.print("*");
			}
			else 
				System.out.print("&");
			}
			System.out.println();
		}
		sc.close();
	}

}



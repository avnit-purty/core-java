package com.logicalprogram.starpattern;

import java.util.Scanner;

public class StarPattern17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k == 1 || k == i) {

					System.out.print("*");

				}

				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				
			}
			for(int k=n;k>=i;k--) {
				if(k==n||k==i) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}
}

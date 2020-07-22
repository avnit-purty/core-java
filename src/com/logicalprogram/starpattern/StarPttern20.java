package com.logicalprogram.starpattern;

import java.util.Scanner;

public class StarPttern20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			for(int k=2;k<(i*2);k++) {
				System.out.print(" ");
			}
			for(int l=n;l>=i;l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=2;k<(i*2);k++) {
				System.out.print(" ");
			}
			for(int l=n;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}

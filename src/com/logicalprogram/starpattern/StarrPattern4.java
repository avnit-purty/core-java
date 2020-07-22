package com.logicalprogram.starpattern;

public class StarrPattern4 {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		int n=5;
		pattern(n);

	}

}

package com.logicalprogram.starpattern;

public class pattern11 {
	public static void pattern(int n) {
		/*
		 * for(int i=1;i<n;i++) { for(int j=1;j<=i;j++) { System.out.print("+"); }
		 * 
		 * for(int k=9;k>(i*2);k--) { System.out.print("*"); } System.out.println(); }
		 */
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				System.out.print("*");
				//System.out.println(k);
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("+");
			}
			for(int k=1;k<(i*2);k++) {
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

package com.logicalprogram.starpattern;

public class Starpattern1 {
	
	public static void leftStarPat(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
         int n=5;
         leftStarPat(n);
	}

}

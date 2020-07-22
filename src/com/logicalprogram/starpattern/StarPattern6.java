package com.logicalprogram.starpattern;

public class StarPattern6 {
	
	public static void pattern(int n) {
		//for first formula
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			  for(int k=9;k>(i*2);k--) {
				  System.out.print("*"); }
			 
			System.out.println();
		}*/
		//second formula
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
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
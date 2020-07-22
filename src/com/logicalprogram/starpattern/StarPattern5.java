package com.logicalprogram.starpattern;

public class StarPattern5 {
public static void pattern(int n) {
	for(int i=1;i<=n;i++) {
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

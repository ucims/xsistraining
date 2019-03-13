package com.github.ucims.logic01;

public class Soal08 {

	public Soal08() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int n = 9;
//		int titikTengah = (n-1)/2;
		 for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j && i <= n-1-j || i>=j && i >= n-1-j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");			
		}
	}

}

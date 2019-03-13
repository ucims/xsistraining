package com.github.ucims.logic01;

public class Soal03 {

	public Soal03() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j || i == n-1-j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");

		}
	}

}

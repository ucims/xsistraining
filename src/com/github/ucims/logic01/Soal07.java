package com.github.ucims.logic01;

public class Soal07 {

	public Soal07() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		int n = 9;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 9; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.print("\n");			
			
		}
	}

}

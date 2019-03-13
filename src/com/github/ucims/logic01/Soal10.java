package com.github.ucims.logic01;

public class Soal10 {

	public Soal10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int titikTengah = (n-1)/2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j && i >= titikTengah || i >= j && i <= titikTengah) { //
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}
		
	}

}

package com.github.ucims.logic01;

public class Soal12 {

	public Soal12() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int n = 9;
		int titikTengah = (n-1)/2;
		
		for (int i = 0;  i < n; i++) {
			for (int j = 0; j < n; j++) {
//				if (j == n-n || j == n-1 || i == n-1 || i == n-n || j == titikTengah && i == titikTengah) {
//					System.out.print('*');
//				} else {
//					System.out.print(' ');					
//				}
				if (i == n-n && j == n-n || i == n-n && j == n-1 || i== n-1 && j == n-n || i == n-1 && j == n-1) {
					System.out.print("#");
				} else if(i == titikTengah && j == titikTengah || i == n-n || j == n-n || i == n-1 || j == n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print('\n');
		}
	}

}

package com.github.ucims.logic01;

public class Soal11 {

	public Soal11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int titikTengah = (n-1)/2;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= n-1-j && j >= titikTengah || j >= n-1-i && j<= titikTengah || i <= j && i >= titikTengah || i >= j && i <= titikTengah ) { //
					System.out.print('*');
				} else {
					System.out.print(' ');					
				}
			}
			System.out.print('\n');
		}

	}

}

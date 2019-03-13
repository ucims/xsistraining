package com.github.ucims.logic01;

public class Soal02 {

	public Soal02() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = n; j >= i ; j--) {
				/*
				 * if(i = n-1-j)
				 *  for other way
				 * */
				if (j == i) {
					System.out.print("*");					
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}

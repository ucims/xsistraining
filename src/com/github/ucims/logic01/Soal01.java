package com.github.ucims.logic01;

public class Soal01 {

	public Soal01() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		int n = 9;
		
		for(int i = 0; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				
				if(j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n ");
		}
	}
}

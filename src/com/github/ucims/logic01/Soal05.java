package com.github.ucims.logic01;

public class Soal05 {

	public Soal05() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int n = 9;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(j == n-n || j == n-1 || j == i || i == n-1-j || i == n-n || i == n-1) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}
	}

}

package com.sd.P1;

class Hundred{
	void plus(){
		int num = 0;
		for (int i = 0; i<=100; i++){
			num += i;
		}
		System.out.println(num);
	}
	public static void main(String[] args){
		Hundred h = new Hundred();
		h.plus();
	}
} 
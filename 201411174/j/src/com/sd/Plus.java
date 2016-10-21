package com.sd.P1;

class Plus{
	public int a = 1;
	public int b = 2;
	
	void plus(){
		System.out.println(a+b);
	}

	public static void main(String[] args){
		Plus p = new Plus();
		p.plus();
	}
}
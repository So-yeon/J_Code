package com.sd.P2;

class Subway{
	public int line = 3;

	public void run(){
		System.out.print(line + " line is running.");
	}
	public static void main(String[] args){
		Subway s = new Subway();
		s.run();
	}
}
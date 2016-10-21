package com.sd.P2;

class Subway2{
	int line = 9;

	public void setLine(int l){
		line = l;
	}
	public void run(){
		System.out.println(line +" line is running");
	}	
	
	public static void main(String[] args){
		Subway2 s = new Subway2();
		s.setLine(5);
		s.run();
	}
}
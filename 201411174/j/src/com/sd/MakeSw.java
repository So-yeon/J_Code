package com.sd.Prac;
import ch.aplu.turtle.*;

class MakeSw{
	Turtle t1 = new Turtle();
	void makeSwirlSquare(int size, int bigger, int turns, double degree){
		for(int i = 0; i<turns; i++){
			if(i%2 != 0){
				size += bigger;
				t1.forward(size);
				t1.right(degree);
			}
		}
	}

	public static void main(String[] args){
		MakeSw m = new MakeSw();
		m.makeSwirlSquare(50,5,50,90);
	}
}
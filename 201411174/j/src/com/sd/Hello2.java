package com.sd.P2;
//�̸��ֱ�, Ŭ������ �Ӽ��ֱ�
class Hello2{
	public String name = "Soyeon";
	public String name2 = "Yeseul";

	public void sayHello(){
		System.out.println(name + " Say Hello to " + name2);
	}
	public static void main(String[] args){
		Hello2 h = new Hello2();
		h.sayHello();
	}
}
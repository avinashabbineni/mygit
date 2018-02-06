package com.edj.test;

public class TestDemo {

	static Demo d = new Demo(){
		void show() {
	           super.show();
	           System.out.println("i am in Flavor1Demo class");
	    }
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d.show();
	}

}

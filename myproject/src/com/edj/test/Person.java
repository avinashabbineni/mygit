package com.edj.test;

public class Person {
	
	class Data{
		void show(){
			System.out.println("Inner");
		}
	}
	
	interface Game{
		public void game();
	}
	
	public void outterMethod(){
		
		System.out.println("Outer Method");
		
		class Inner{
			
			public void show(){
				System.out.println("Inner Method");
			}
		}
		Inner inn = new Inner();
		inn.show();
		
	}
	
	private static void outerMethod() {
	     System.out.println("inside outerMethod");
	   }
	
	// A static inner class
	   static class Inner {
	     public static void main(String[] args) {
	        System.out.println("inside inner class Method");
	        outerMethod();
	     }
	   }
	 
}

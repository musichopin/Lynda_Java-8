package com.example.javase8;

import com.example.javase8.interfaces.InterfaceWithArgs;

public class UseInterfaceWithArgs {

	public static void main(String[] args) {
		
		// there are 3 elements:
		// 1. explicit interface, 2. lambda expression 
		// (alt: anonymous class veya implementing class) 
		// 3. lambda expressioný çaðýrmak
		InterfaceWithArgs obj = (v1, v2) -> // no need to put "int" in the argument
		{
			int result = v1 + v2;
			System.out.println("The result is " + result);
			
		}; // be careful to the semi-colon
		
//		alt:
//		InterfaceWithArgs obj = new InterfaceWithArgs() {
//			@Override
//			public void calculate(int v1, int v2) {
//				// TODO Auto-generated method stub
//				int result = v1 + v2;
//				System.out.println("The result is " + result);
//			}
//		};
		obj.calculate(5, 10);

	}
}
	
/*
 The result is 15 
 */

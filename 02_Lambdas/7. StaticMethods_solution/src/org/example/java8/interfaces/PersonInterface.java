package org.example.java8.interfaces;

import org.example.java8.model.Person;

public interface PersonInterface {
	
	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	static String getPersonInfo(Person p) { 
		// (PersonInterface p) yaz�nca da sonu� de�i�medi
		return p.getName() + " (" + p.getAge() + ")";
//		! p ref variable argument �zerinden yarat�lm��.
//		in order to refer the instance methods from static getPersonInfo 
//		method we need instance of the person object
	}
//	with java 8 we can provide fully implemented static methods
//	that would be inheritable by implementing classes
}

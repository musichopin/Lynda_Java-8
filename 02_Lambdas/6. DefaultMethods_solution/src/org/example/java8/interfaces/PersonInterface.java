package org.example.java8.interfaces;

public interface PersonInterface {
	
	String getName(); 
	void setName(String name); 
	// abstract methods are implicity public in interfaces
	int getAge();
	void setAge(int age);

	default String getPersonInfo() {
		return getName() + " (" + getAge() + ")";
	}
//	with java 8 we can provide fully implemented methods
//	that would be inheritable by implementing classes
	
}

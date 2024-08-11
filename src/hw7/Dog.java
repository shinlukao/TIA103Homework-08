package hw7;

import java.io.Serializable;

public class Dog implements Serializable {
//	private static final long serialVersionUID = 8315449942815314808L;
	private String name;
	
	public Dog() {}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}

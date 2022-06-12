package com.xworkz.corejava.ControlStatements;

public class ForEach {
	public static void main(String[] args) {
		String[] names = { "	Bhoomi", "Moni", "Asha" };
		System.out.println("Printing the content of the array names:\n");
		for (String name : names) {
			System.out.println(name);
		}
	}
}

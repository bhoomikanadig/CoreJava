package com.xworkz.corejava.Abstraction.Interface;

public class MainMethod {

	public static void main(String[] args) {
		Computer computer=new Computer();
		Epson epson=new Epson();
		Sony sony=new Sony();
		computer.slot(sony);
		computer.slot(epson);
		
		
	

	}

}

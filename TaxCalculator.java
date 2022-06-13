package com.xworkz.corejava.Abstraction.Interface;

public class TaxCalculator implements CentralTax,StateTax {

	@Override
	public void State() {
		System.out.println("state tax is 100rs");
		
	}

	@Override
	public void central() {
		System.out.println("state tax is 200rs");
		
	}

}

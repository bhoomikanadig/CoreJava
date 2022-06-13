package com.xworkz.corejava.Abstraction.Interface.Bank;

public class BankWork implements karnataka_Bank, SBI_bank {

	@Override
	public void SBIbank() {
		System.out.println("sbi bank tax in india-50Rs per day");

	}

	@Override
	public void karnataka_bank() {
		
		System.out.println("sbi bank tax in india-100Rs per day");
	}

}

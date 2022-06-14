package com.xworkz.corejava.Abstraction.Interface.ATM;

public class AtmImplemntation implements AtmMachineworks, ATMWithdraw{

	@Override
	public void withdraw() {
	System.out.println("you can withdraw money");
		
	}

	@Override
	public void machineworks() {
		System.out.println("Machine works correctly");
		
	}

}

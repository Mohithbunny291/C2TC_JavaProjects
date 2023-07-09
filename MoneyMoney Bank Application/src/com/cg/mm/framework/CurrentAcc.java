package com.cg.mm.framework;

public abstract class CurrentAcc extends BankAcc{
	
	
	private final float creditLimit;

	public float getCreditLimit() {
		return creditLimit;
	}
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
		
	}
	
	public void withdraw(float creditLimit) {
		System.out.println("Available to withdraw in the creditLimit: "+creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + "]";
	}

	
}

package com.cg.mm.framework;

public abstract class SavingAcc extends BankAcc{

	private boolean isSalaried;
	private static final float MINBAL = 1000.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	} 


	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}
	
	public void withdraw(float accBal) {
		System.out.println("Avaliable money to withdraw in account: "+accBal);
	}


	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
}

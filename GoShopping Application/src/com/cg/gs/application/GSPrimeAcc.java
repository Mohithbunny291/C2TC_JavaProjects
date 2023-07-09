package com.cg.gs.application;

import com.cg.gs.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	
	private static final float charges = 500.0f;	
	
	public GSPrimeAcc
			(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		System.out.println(accNo+" "+accNm+" "+charges+" "+isPrime);
	}
	
	public float getCharges() {
		return charges;
	}

	public void bookProduct(float charges) {
		System.out.println("As a Prime user the charges for the product are: "+charges+" No extra Delivery charges");
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
}

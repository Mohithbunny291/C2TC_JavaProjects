package com.cg.gs.framework;

public abstract class PrimeAcc extends ShopAcc{
	
	private boolean isPrime;
	private static final float deliveryCharges = 50.0f;
	
	
	
	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public float getDeliverycharges() {
		return deliveryCharges;
	}

	public PrimeAcc
			(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	public void bookProduct(float charges) {
		System.out.println("Products are book and Charges: "+charges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}	
	
}

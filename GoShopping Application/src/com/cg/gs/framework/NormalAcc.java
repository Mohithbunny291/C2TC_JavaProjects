package com.cg.gs.framework;

public abstract class NormalAcc extends ShopAcc{
	
	private final float deliveryCharges;
	
	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	public NormalAcc
			(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	public void bookProduct(float deliveryCharges) {
		System.out.println("Charges are: "+deliveryCharges);

	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}

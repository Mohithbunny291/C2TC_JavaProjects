package com.cg.gs.application;

import com.cg.gs.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	
	
	public GSNormalAcc
			(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		System.out.println(accNo+" "+accNm+" "+charges+" "+deliveryCharges);
	}

	public void bookProduct(float deliveryCharges) {
		
		System.out.println("As a non-Prime/Normanl user charges for the product are: "+getCharges()+" and delivery charges are: " +deliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", toString()=" + super.toString()
				+ ", getaccNo()=" + getaccNo() + ", getaccNm()=" + getaccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}

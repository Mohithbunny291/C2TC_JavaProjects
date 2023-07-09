package com.cg.mm.application;

import com.cg.mm.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		System.out.println(accNo+" "+accNm+" "+accBal+" "+creditLimit);
	}
	
	public void withdraw(float getAccBal) {
		System.out.println("As you have Current account in our bank, Avaliable your balance to withdraw is: "+getAccBal()+"Rs. Credit Limit is "+getCreditLimit()+"Rs.");
	}

	@Override
	public String toString() {
		return getCreditLimit()+"Rs is your CREDIT LIMIT as of now in your MMCurrentAcc.";
	}
	
}

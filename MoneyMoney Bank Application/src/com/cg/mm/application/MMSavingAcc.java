package com.cg.mm.application;

import com.cg.mm.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	//private static final float MINBAL = 1000.0f;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		System.out.println(accNo+" "+accNm+" "+accBal+" "+isSalaried);
	}

//	public static float getMinbal() {
//		return getMinbal();
//	}
	
	public void withdraw(float MINBAL) {
		System.out.println("As you have Saving account in our bank, Avaliable balance to withdraw is: "+MINBAL+"Rs."
				+ " No credit Limit. MINIMUM balance "+getMinbal()+"Rs has to be maintained.");
	}

	@Override
	public String toString() {
		return getMinbal()+"Rs is the MINIMUM BALANCE to be maintained in your MMSavingAcc.";
	}

		
}

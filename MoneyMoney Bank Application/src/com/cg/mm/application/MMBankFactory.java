package com.cg.mm.application;

import com.cg.mm.framework.BankFactory;
import com.cg.mm.framework.CurrentAcc;
import com.cg.mm.framework.SavingAcc;


public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount
			(int AccNo, String accNm, Float accBal, Boolean isSalaried) {
		MMSavingAcc mmsavingacc = new MMSavingAcc(AccNo, accNm, AccNo, isSalaried);
		return mmsavingacc;
	} 
	
	@Override
	public CurrentAcc getNewCurrentAccount
			(int AccNo, String accNm, Float accBal, Float creditLimit) {
		MMCurrentAcc mmcurrentacc = new MMCurrentAcc(AccNo, accNm, AccNo, AccNo);
		return mmcurrentacc;
	}

}

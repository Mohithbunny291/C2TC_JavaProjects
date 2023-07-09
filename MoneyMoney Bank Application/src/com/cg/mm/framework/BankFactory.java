package com.cg.mm.framework;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAccount
			(int AccNo,String accNm,Float accBal,Boolean isSalaried);
	
	public abstract CurrentAcc getNewCurrentAccount
			(int AccNo,String accNm,Float accBal,Float creditLimit);	
}

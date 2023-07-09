package com.cg.mm.client;

import com.cg.mm.application.MMCurrentAcc;
import com.cg.mm.application.MMSavingAcc;
import com.cg.mm.framework.CurrentAcc;
import com.cg.mm.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		
	//	BankFactory bf = new MMBankFactory(); //Assign instance of MMBankFactory to BankFactory reference.
		SavingAcc sa = new MMSavingAcc(1001, "Mohith", 10000, true); //Instantiate MMSavingAcc and refer it through reference SavingAcc.
		CurrentAcc ca = new MMCurrentAcc(1101, "Rohith", 100000, 1000000); //Instantiate MMCurrentAcc and refer it through reference CurrentAcc.
		
		sa.withdraw(sa.getAccBal()); //Invoke withdraw() method.
		ca.withdraw(ca.getCreditLimit()); //Invoke withdraw() method.
		
	//	System.out.println(bf); //Invoke toString() method.
		System.out.println(sa); //Invoke toString() method.
		System.out.println(ca); //Invoke toString() method.

	}

}

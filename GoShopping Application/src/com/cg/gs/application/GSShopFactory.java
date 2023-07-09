package com.cg.gs.application;

import com.cg.gs.framework.NormalAcc;
import com.cg.gs.framework.PrimeAcc;
import com.cg.gs.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount
			(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAccount
			(int AccNo, String accNm, float charges, float delivaryCharges) {
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, charges, delivaryCharges);
		return gsnormal;
	}

}

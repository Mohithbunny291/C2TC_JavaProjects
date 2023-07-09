package com.cg.gs.framework;

public abstract class ShopAcc {
	
	private int accNo;
	private String accNm;
	private float charges;
	
	
	public int getaccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getaccNm() {
		return accNm;
	}
	public void setaccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float charges) {
		System.out.println("Products are book and charges: "+charges);
	}
	public void items(float charges) {
		System.out.println("Items will be deliverd with charges: "+charges);
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
}

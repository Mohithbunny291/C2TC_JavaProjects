package com.cg.gs.client;
import com.cg.gs.application.GSNormalAcc;
import com.cg.gs.application.GSPrimeAcc;
import com.cg.gs.application.GSShopFactory;
import com.cg.gs.framework.NormalAcc;
import com.cg.gs.framework.PrimeAcc;
import com.cg.gs.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		
		ShopFactory sf = new GSShopFactory(); //Assign instance of GSShopFactory to ShopFactory reference
		PrimeAcc pa = new GSPrimeAcc(1001, "Mohith", 500, true); //Instantiate GSPrimeAcc and refer it through reference PrimeAcc
		NormalAcc na = new GSNormalAcc(1101, "Rohith", 500, 50); //Instantiate GSNormalAcc and refer it through reference NormalAcc
		
		pa.bookProduct(pa.getCharges()); //Invoke bookProduct() method
		na.bookProduct(pa.getDeliverycharges()); //Invoke bookProduct() method
		
		
		System.out.println(pa); //Invoke toString() method
		System.out.println(na); //Invoke toString() method
		System.out.println(sf); //Invoke toString() method
		
	}

}

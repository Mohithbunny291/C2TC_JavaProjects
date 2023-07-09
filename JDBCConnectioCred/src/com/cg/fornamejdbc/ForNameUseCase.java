package com.cg.fornamejdbc;

public class ForNameUseCase {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
//		ForNameStatic FNS = new ForNameStatic();
		
		Class.forName("ForNameStatic").newInstance();
		
	}

}
class ForNameStatic{
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
}

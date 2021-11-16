package eCommerceSystem.business.utilities;

public class BusinessRules {
	
	public static boolean run(boolean... logics) {
		boolean result=true;
		for(boolean logic:logics) {
			if(logic==false) {
				result=false;
			}
			
		}
		return result;
	}

}

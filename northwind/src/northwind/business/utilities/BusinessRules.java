package northwind.business.utilities;

public class BusinessRules {
   public static boolean run(boolean... logics) {
	   for(boolean logic:logics) {
		   if(logic==false) {
			   return false;
		   }
	   }
	   return true;
	   
   }
}

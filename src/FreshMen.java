import java.util.*;

public class  FreshMen {

public static double KeyValFresh( int pHousing, int rand) {

	//double ph = 0.0;
	//double prd = 0.0;
	//System.out.println(pHousing + " " + rand);
		double ph = (pHousing/19.0) * 75.0;

		double prd = (rand/500.0) * 25.0;

   double key = ph + prd; 
   //System.out.println(ph + " " + prd);
   return key;
   }
}

import java.util.*;

public class  Sum {

	public static double KeyVal(int pHousing, int pRDN, boolean used, int rand) {

	if( used == true ){

		double ph = (pHousing/19.0) * 50.0;

		double prd = (pRDN/500.0) * 40.0;

		double p = (rand/500.0) * 10.0;

		double key = ph + prd + p; 

		return key;
		
	}


     else{

		double ph = (pHousing/19.0) * 70.0;

		double prd = (pRDN/500.0) * 20.0;

		double p = (rand/500.0) * 10.0;

		double key = ph + prd + p; 	

		return key;
	 }

    
}

}

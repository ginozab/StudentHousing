import java.util.*;
import java.io.*;

public class RoomDraw {
	
	public static void main(String[] args){

		String year = args[0];

	/***************************************************************
	*
	* Code if user wants freshmen
	* Creates random freshmen class w/ random housing
	* Calculates each students key value
	* Sorts them by key value
	* 
	 ****************************************************************/

	if (year.equals("freshmen")){

		Student[] Freshmen = new Student[500];

		CreateRandomClass.randomClass(Freshmen, "freshmen");

		// for (int j = 0; j < 500; j++){
			
		// 	System.out.println(Freshmen[j].getName() + " " + Freshmen[j].getYear() + " " + Freshmen[j].getFH());

		// } // for 

		/************************************************************
		*
		* call SKey method to calculate key values for all freshmen
		* Put all the key values into a double[]
		* Sort all the students by key value with sort()
		* Print out 
		* 
		 ************************************************************/

		CalculateSKey.SKey(Freshmen, "Freshmen");
		double [] key = new double[500];
		for (int k = 0; k < 500; k++){
			//System.out.println(Freshmen[k].getName() + " " + Freshmen[k].getfKey());
			key[k] = Freshmen[k].getfKey();
		} // for

		sort(Freshmen, key);

		// System.out.println("*************************************");
		// System.out.println("*************************************");
		// System.out.println("*************************************");

		int keyf = 1;

		for (int k = 499; k >= 0; k--){
			Freshmen[k].setfRDN(keyf);
			System.out.println(Freshmen[k].getName() + " " + Freshmen[k].getfKey() + " " + Freshmen[k].getfRDN() + " " + Freshmen[k].getFH());
			//key[k] = Freshmen[k].getfKey();
			keyf++;
		} // for

	} // if args = freshmen
	
	/**********************************************************
	*
	* If user wants sophmore 
	* 
	 *********************************************************/
	if (year.equals("sophmore")){
	Student[] Sophmore = new Student[500];

	CreateRandomClass.randomClass(Sophmore, "sophmore");

	CalculateSKey.SKey(Sophmore, "Sophmore");
	double [] soKey = new double[500];

	for (int l = 0; l < 500; l++){
		soKey[l] = Sophmore[l].getsKey();
	} // for

	for (int m = 0; m < 500; m++){
		System.out.println(Sophmore[m].getName() + " " + Sophmore[m].getsKey() + " " + Sophmore[m].getfRDN() + " " + Sophmore[m].getSH() + " " + Sophmore[m].getUsed());
	} // for

	System.out.println("******************************************************");

	sort(Sophmore, soKey);

	int keyS = 1;
	for (int n = 499; n >= 0; n--){
		Sophmore[n].setsRDN(keyS);
		System.out.println(Sophmore[n].getName() + " " + Sophmore[n].getfRDN() + " " + Sophmore[n].getSH() + " " + Sophmore[n].getsKey() + " " + Sophmore[n].getsRDN());
		keyS++;
	} // for 
	} // if year equals sophmore

	/*
	*
	* If user wants Junior
	* 
	 */
	
	if (year.equals("junior")){
		Student[] Junior = new Student[500];

		CreateRandomClass.randomClass(Junior, "junior");

		CalculateSKey.SKey(Junior, "Junior");
		double [] jrKey = new double[500];

		for (int o = 0; o < 500; o++){
			jrKey[o] = Junior[o].getjKey();
		}

		sort(Junior, jrKey);

		int keyJ = 1;

		for (int p = 499; p >= 0; p--){
			Junior[p].setjRDN(keyJ);
			System.out.println(Junior[p].getName() + " " + Junior[p].getsRDN() + " " + Junior[p].getJH() + " " + Junior[p].getjKey() + " " + Junior[p].getjRDN());
			keyJ++;
		}
	}

	if (year.equals("individual")){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter previous housing: ");
		String userH = scan.nextLine();
		int userHPriority = Housing.getPriority(userH);

		System.out.println("Enter previous room draw number: ");
		int userRDN = scan.nextInt();
		String a = scan.nextLine();

		System.out.println("Did you use your previous room draw number: ");
		String userU = scan.nextLine();

		boolean usedN = false;
		if (userU.equals("yes")){
			usedN = true;
		}

		else {}

		int randomNum1 = 1 + (int)(Math.random() * 500);

		double uKey = Sum.KeyVal(userHPriority, userRDN, usedN, randomNum1);

		System.out.println("Your room draw key value is: ");

		System.out.println(uKey);

	} // if individual

} // createStudent

	// ********************************************************
   	// Sorting function (insertion sort)
   	// ********************************************************    
       public static void sort(Object [] o, double[] a) {
	
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
                exch(o, j, j-1);
            }
            //assert isSorted(a, 0, i);
        }
        //assert isSorted(a);
    }
    
    // exchange a[i] and a[j]  (for indirect sort)
    private static void exch(double[] a, int i, int j) {
        double swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    
    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

	// is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }

}

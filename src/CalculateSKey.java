import java.util.*;
import java.io.*;

public class CalculateSKey {
	
	public static void SKey(Student[] student, String year) {

		//Random rand = new Random();

		int[] rNum = new int[500];

		RandomBG.uniqueRand(rNum);

			if (year.equals("Junior")){
			
				for (int i = 0; i < 500; i++){
					// get previous housing priority
					String pHousing = student[i].getJH();
					int house = Housing.getPriority(pHousing);

					// get previous room draw number
					int pRDN = student[i].getsRDN();

					// get used boolean
					boolean usedRDN = student[i].getUsed();

					//int randomNum = 1 + (int)(Math.random() * 500);

					int randomNum = rNum[i];

					double key = Sum.KeyVal(house, pRDN, usedRDN, randomNum);

					student[i].setjKey(key);

				}
			}
			else if (year.equals("Sophmore")){
				
				for (int j = 0; j < 500; j++){
					// get previous housing priority
					String pHousing = student[j].getSH();
					int house = Housing.getPriority(pHousing);

					// get previous room draw number
					int pRDN = student[j].getfRDN();

					// get used boolean
					boolean usedRDN = student[j].getUsed();

					//int randomNum = 1 + (int)(Math.random() * 500);

					int randomNum = rNum[j];

					double key = Sum.KeyVal(house, pRDN, usedRDN, randomNum);

					student[j].setsKey(key);

				}
			}

			else if (year.equals("Freshmen")){
				
				for (int k = 0; k < 500; k++){
					// get previous housing priority
					String pHousing = student[k].getFH();
					int house = Housing.getPriority(pHousing);

					//System.out.println(house);

					//int randomNum = 1 + (int)(Math.random() * 500);

					int randomNum = rNum[k];
					//System.out.println(randomNum);

					double key = FreshMen.KeyValFresh(house, randomNum);

					//System.out.println(key);

					student[k].setfKey(key);
				}
			}

	} // calculateSKey method

} // class
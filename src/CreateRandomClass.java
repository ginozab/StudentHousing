import java.util.*;
import java.io.*;

public class CreateRandomClass {
	public static void randomClass(Student[] st, String year){
		if (year.equals("freshmen")){
		for(int i = 0; i < 500; i++){
			Student s = new Student();
			String name = "Freshmen" + i;
			s.setName(name);
			s.setYear("Freshmen");

			if (i < 210){
				s.setFH("BwD");
			}

			else if (i >= 210 && i < 235){
				s.setFH("BD");
			}

			else if (i >= 235 && i < 260){
				s.setFH("CDT");
			}

			else if (i >= 260 && i < 295){
				s.setFH("CD");
			}

			else if (i >= 295 && i < 320){
				s.setFH("ED");
			}

			else if (i >= 320 && i < 400){
				s.setFH("RD");
			}

			else if (i >= 400 && i < 475){
				s.setFH("SD");
			}

			else if (i >= 475 && i < 500){
				s.setFH("WD");
			}

			st[i] = s;
		} // for 
		} // if freshmen

		/*
		Sophmore Living
Brooks-- 50
Caflisch--100
College Court--15
Allegheny Commons--25
Crawford--30
Edwards--15
North Village--0
Ravine--50
Schultz--65
Allegheny Hall--0
Walker--150
Houses--0

		 */

		else if (year.equals("sophmore")){
			for (int j = 0; j < 500; j++){

				Student so = new Student();
				String name1 = "Sophmore" + j;
				so.setName(name1);
				so.setYear("Sophmore");

				if (j < 50){
					so.setSH("BD");
				}

				else if (j >= 50 && j < 125){
					so.setSH("CDT");
				}

				else if (j >= 125 && j < 150){
					so.setSH("CS");
				}

				else if (j >= 150 && j < 165){
					so.setSH("CC");
				}

				else if (j >= 165 && j < 190){
					so.setSH("AC");
				}

				else if (j >= 190 && j < 220){
					so.setSH("CD");
				}

				else if (j >= 220 && j < 235){
					so.setSH("ED");
				}

				else if (j >= 235 && j < 285){
					so.setSH("RD");
				}

				else if (j >= 285 && j < 350){
					so.setSH("SD");
				}

				else if (j >= 350 && j < 375){
					so.setSH("WS");
				}

				else if (j >= 375 && j < 500){
					so.setSH("WD");
				}

				st[j] = so;


			} // for

			// Give each sophmore a room Draw number
			// this is for testing purposes thats why it is random

			int[] soRDN = new int[500];
			RandomBG.uniqueRand(soRDN);

			for (int k = 0; k < 500; k++){
				st[k].setfRDN(soRDN[k]);
				
				if (k < 250){
					st[k].setUsed(true);
				}
				else if (k >= 250 && k < 500){
					st[k].setUsed(false);
				}
			}

		} // else if sophmore

		/*
		*
		* If year equals junior
		* 
		 */
		
		/*
		*
		* Junior Living
		Brooks--83
		Caflisch--35
		College Court--60
		Allegheny Commons-- 18
		Crawford-- 2
		Edwards-- 14
		North Village (nv1-30)(nv2-130)
		Ravine-– 15
		Schultz--  3
		Allegheny Hall--10
		Walker--20
		Houses-80
		*
		 */

		else if (year.equals("junior")){
			for (int l = 0; l < 500; l++){

				Student jr = new Student();
				String name2 = "Junior" + l;
				jr.setName(name2);
				jr.setYear("Junior");

				if (l < 60){
					jr.setJH("CC");
				}

				if (l >= 60 && l < 95){
					jr.setJH("CS");
				}

				if (l >= 95 && l < 130){
					jr.setJH("BS");
				}

				if (l >= 130 && l < 178){
					jr.setJH("BD");
				}

				if (l >= 178 && l < 196){
					jr.setJH("AC");
				}

				if (l >= 196 && l < 198){
					jr.setJH("CD");
				}

				if (l >= 198 && l < 212){
					jr.setJH("ED");
				}

				if (l >= 212 && l < 242){
					jr.setJH("Nv1");
				}

				if (l >= 242 && l < 312){
					jr.setJH("Nv2Q");
				}

				if (l >= 312 && l < 372){
					jr.setJH("Nv2D");
				}

				if (l >= 372 && l < 387){
					jr.setJH("RD");
				}

				if (l >= 387 && l < 390){
					jr.setJH("SD");
				}

				if (l >= 390 && l < 400){
					jr.setJH("AH");
				}

				if (l >= 400 && l < 420){
					jr.setJH("WS");
				}

				if (l >= 420 && l < 500){
					jr.setJH("CS");
				}

				st[l] = jr;

			} // for

			int[] jrRDN = new int[500];
			RandomBG.uniqueRand(jrRDN);

			for (int k = 0; k < 500; k++){
				st[k].setsRDN(jrRDN[k]);
				
				if (k < 250){
					st[k].setUsed(true);
				}
				else if (k >= 250 && k < 500){
					st[k].setUsed(false);
				}
			}

		} // if junior

	} // method

} // class


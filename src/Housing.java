public class Housing{

public static int getPriority(String n){

 // The Weights of the housing in terms of best to worst.
 // Weights were taken from surveys and therefore represent the student body's opinions.
 /*
  int Nv1 = 1;  // North Village 1
 int Nv2Q = 2; // North village 2 quad
 int OCH = 3;  // Off campus house 
 int CC = 4;   // college court
 int Nv2D = 5; // north village 2 double
 int AC = 6;   // allegheny commons
 int WS = 7;   // walker single
 int AH = 8;   // allegheny hall
 int ES = 9;   // edwards single
 int CS = 10;  // caflish single
 int BS = 11;  // brooks single
 int BwD = 12; // baldwin double
 int CDT = 13; // Caflish double/triple
 int WD = 14;  // walker double
 int BD = 15;  // brooks double
 int ED = 16;  // edwards double
 int CD = 17;  // crawford double
 int SD = 18;  // shultz double
 int RD = 19;  // ravine double
 */
	
 
 int priority = 0;
 switch (n)
 {

	 case"Nv1":
	 priority =1;
	 break;

	 case "Nv2Q":
	 priority = 2;
     break;

     case "OCH":
	 priority = 3;
	 break;

	 case "CC":
	 priority = 4;
	 break;
 	
 	 case "Nv2D":
	 priority = 5;
	 break;
    
     case "AC":
	 priority = 6;
	 break;

     case "WS":
	 priority = 7;
	 break;

	 case "AH":
	 priority = 8;
	 break;

	 case "ES":
	 priority = 9;
	 break;

	 case "CS":
	 priority = 10;
	 break;

     case "BS":
	 priority = 11;
	 break;

	 case "BwD":
	 priority = 12;
	 break;

     case "CDT":
	 priority = 13;
	 break;

     case "WD":
	 priority = 14;
	 break;

     case "BD":
     priority = 15;
 	 break;

     case "ED":
     priority = 16;
     break;

     case "CD":
     priority = 17;
     break;

	 case "SD":
     priority = 18;
     break;
     
     case "RD":
   	 priority = 19;
   	 break;
 
    	}
 		return priority; 
 
	}
}

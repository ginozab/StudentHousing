import java.util.*;
import java.io.*;

public class RandomBG{

public static void uniqueRand(int[] rNum){

	//int[] rNum = new int[500];

	for (int i = 0; i < 500; i++){
		while (true){
		int randomNum = 1 + (int)(Math.random() * 500);
		boolean done = false;
			for (int m = 0; m < i; m++){
				
				int check = rNum[m];
				if (check == randomNum){
					
					done = true;

				}
				
			}
		
		if (done == false){

		rNum[i] = randomNum;
			break;
		}

		else {}
		}
	}
	
	// for (int j = 0; j < 500; j++){
	// 	System.out.println(rNum[j]);
	// }
}
}

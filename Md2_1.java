package PakotneMd2;

import java.util.Arrays;

public class Md2_1 {
	static void klasiska(int[]arr) {
	//Autors: Agita Martinsone
		//Klasiskā Burbuļa metode
		
int tmp, Sk=0;

for(int i=0; i<arr.length-1; i++) {//ārējais cikls
	for(int j=0; j<arr.length-1; j++) {//iekšējais cikls
		Sk++;//iekšējo ciklu jeb salīdzināšanas darbību skaitītājs.
		
		//ja skaitļi nav pareizā secībā, tad samaina.
		if(arr[j]>arr[j+1]) {// salīdzina masīva elementu ar nākošo elementu.
			tmp=arr[j]; //'atm' ir papildus mainīgais, kur saglabā vērtību, kamēr veic maiņu.
			arr[j]=arr[j+1];
			arr[j+1]=tmp;
			
		}
		}
	}
	System.out.println("Sakārtots masīvs:");
	System.out.println(Arrays.toString(arr));//drukā masīvu.
	System.out.println("Veikto skaitļu salīdzināšanu skaits ir "+Sk+"\n");//drukā j ciklu skaitu.


}		
}

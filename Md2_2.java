package PakotneMd2;

import java.util.Arrays;

public class Md2_2 {
static void uzlabota1(int[]arr) {
	//Autors: Agita Martinsone
	//1.Uzlabotā Burbuļa kārtošanas metode. 
	//Nepārbauda elementus no masīva beigām, par kuriem jau zināms, ka ir sakārtoti.
	int tmp, Sk=0;

	for(int i=0; i<arr.length-1; i++) {//ārējais cikls
		for(int j=0; j<arr.length-i-1; j++) {//iekšējais cikls. Ar katru ciklu pārbauda par i elementiem mazāk.
			Sk++;//iekšējo ciklu jeb salīdzināšanas darbību skaitītājs.
			
			//ja skaitļi nav pareizā secībā, tad samaina.
			if(arr[j]>arr[j+1]) {// salīdzina masīva elementu ar nākošo elementu.
				tmp=arr[j]; //'tmp' ir papildus mainīgais, kur saglabā vērtību, lai veiktu maiņu.
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

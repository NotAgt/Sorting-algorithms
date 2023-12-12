package PakotneMd2;

import java.util.Arrays;

public class Md2_3 {
	static void uzlabota2(int[]arr) {
		//Autors: Agita Martinsone
		//2.Uzlabotā Burbuļa kārtošanas metode.
		//Izlaiž elementus, kurus nav nepieciešams mainīt vietām.
		
		int tmp, Sk=0, swap=0;
		int n = arr.length;// saglabā mainīgajā n masīva elementu saitu.
		
		do{
		    swap = 0;
		    for (int i = 0; i < n-1; i++){
		    	Sk++;//ciklu skaitītājs
		    	
		      if(arr[i+1] < arr[i]){//ja nav pareizā secībā, samaina skaitļus vietām.
		         tmp = arr[i];
		         arr[i] = arr[i+1];
		         arr[i+1] = tmp;
		         swap = 1;
		      }
		    }
		    n = n - 1;//sakārtotos elementus no masīva beigām nepārbaudam.
		  } while (swap == 1); //pilda ciklu, kamēr vairs nav nepieciešams mainīt nevienu elementu.
	
		System.out.println("Sakārtots masīvs:");
		System.out.println(Arrays.toString(arr));//drukā masīvu.
		System.out.println("Veikto skaitļu salīdzināšanu skaits ir "+Sk+"\n");//drukā salīdzināšanu skaitu.
		}
		}

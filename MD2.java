package PakotneMd2;

import java.util.Arrays;
import java.util.Scanner;

public class MD2 {
	// Autors: Agita Martinsone
	
	static void MergeSort(int[] arr) { //Masīva sadalīšana
		int n = arr.length;
		if(n<2) {//ja masīvs mazāks par 2 elementiem, tad uzskata kā sadalītu.
			return;
		}
		int mid = n/2;//atrod masīva vidu
		int [] leftHalf = new int[mid]; //kreisās puses elementu skaits
		int [] rightHalf = new int[n-mid]; //labās puses elementu skaits
		
		for(int i=0; i<mid; i++) {
			leftHalf[i] = arr[i];//izveido masīvu ar kreisās puses elementiem
		}
		for(int i=mid; i<n; i++) {
			rightHalf[i-mid]=arr[i]; //izveido masīvu ar labās puses elementiem
		}
		/*Metode izsauc pati sevi katrai daļai, 
		līdz masīvs ir sadalīts pa 1 elementam.*/
		MergeSort(leftHalf);
		MergeSort(rightHalf);
		
		merge(arr, leftHalf, rightHalf); //izsauc metodi merge
		
	}
	
	static void merge(int[]arr, int[]leftHalf, int[]rightHalf) {//Elementu sapludināšana, kārtošana.
		int leftSize = leftHalf.length; //nosaka masīva elementu skaitu
		int rightSize = rightHalf.length;
		
		int i=0, j=0, k=0; //mainīgie, kur saglabāt kreiso un labo masīvu, un sapludināto masīvu(k).
		while(i<leftSize && j<rightSize) { //veido ciklu kamēr atbilst masīva elementu skaitam.
			
			//salīdzina katru viena masīva elementu ar otra masīva elementiem. 
			//Katru mazāko saglabā masīvā k.
			if(leftHalf[i]<=rightHalf[j]) { 
				arr[k] = leftHalf[i];
				i++;
			}
			else {
				arr[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		//Pievieno masīvam k atlikušo(lielāko) kreisā vai labā masīva elementu.
		while (i<leftSize) {
			arr[k]=leftHalf[i];
			i++;
			k++;
		}
		while (j<rightSize) {
			arr[k]=rightHalf[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		//Dotais masīvs
		int[] arr = {54, 70, 75, 63, 17, 59, 87, 16, 
				93, 81, 60, 67, 90, 53, 88, 9, 61, 8, 
				96, 98, 12, 34, 66, 76, 38, 55, 58, 
				27, 92, 45, 41, 4, 20, 22, 69, 77, 
				86, 35, 19, 32, 49, 15, 29, 23, 83, 
				95, 25, 91, 33, 47, 24, 62, 13, 42, 
				73, 44, 78, 72, 7, 5, 10, 48, 71, 18, 
				39, 97, 64, 79, 51, 74, 31, 37, 57, 30, 
				94, 80, 28, 1, 56, 85, 46, 100, 82, 40, 
				26, 21, 68, 43, 14, 3, 65, 99, 89, 52, 84, 
				36, 2, 6, 11, 50};
		
		char izvele;//mainīgais, ko ievada lietotājs
		
		
		Scanner sc = new Scanner(System.in);//importē skaneri.
		
			//izvada paziņojumu (doto masīvu un lietotāja izvēlni)
			System.out.println("Skaitļu masīvs, kas jāsakārto ir:");
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+" | ");
			}	
			System.out.println("\n\nIzvēlies masīva kārtošanas metodi:\n"
				+ "1 -Burbuļa kārtošanas metode (klasiskā);\n"
				+ "2 -Burbuļa kārtošanas metode (1. uzlabotā);\n"
				+ "3 -Burbuļa kārtošanas metode (2. uzlabotā);\n"
				+ "4 -Sapludināšanas metode");
		
		//Nolasa no konsoles ievadīto simbolu, saglabā mainīgajā.
		izvele = sc.next().charAt(0);
		
		switch(izvele){
			case '1':
				Md2_1.klasiska(arr);//izpildās klasiskā Burbuļa metode
				break;
			case '2':
				Md2_2.uzlabota1(arr);//izpildās 1. uzlabotā Burbuļa metode
				break;
			case '3':
				Md2_3.uzlabota2(arr);//izpildās 2. uzlabotā Burbuļa metode
				break;
			case '4':
				MergeSort(arr);//izpildās metode MergeSort (Sapludināšanas kārtošanas metode)
				System.out.println("Sakārtots masīvs:\n"+
				Arrays.toString(arr));//Drukā sakārtoto masīvu
				break;
			default:
				System.out.println("Ievadītais simbols nav korekts!");
		}
	sc.close();//Aizver skaneri.
	}
}

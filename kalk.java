package zadanko;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import zadanko.liczenie;


public class kalk {
	
	//W klasie tej mamy manu gdzie sa pobierane linijki do obliczenia działan
	public static void main(String[] args) throws FileNotFoundException {
		Scanner zmienna = new Scanner(System.in);
		int a=1;
		do{
		System.out.println("Witaj w kalkulatorze");
		System.out.println("Wpisz 1, aby uruchomic kalkulator 2 aby wykonac działania z pliku 3 aby zakonczyć program");
		  a = zmienna.nextInt();
		 String pom = null;
		 zmienna.nextLine();
		 
		 if(a==1){
			 do{
			System.out.println("Podaj dzialanie: ");
			 pom=zmienna.nextLine();
			 liczenie.wynik(pom);
			 }while(!pom.equals("koniec"));
			 
		 }else if(a==2){
			 File plik = new File("obliczenia.txt");
			 Scanner odczyt=new Scanner(plik);
			 while(odczyt.hasNextLine()){
				 pom=odczyt.nextLine();
				 liczenie.wynik(pom);
			 }
			 odczyt.close();
		 }
		
		}while(a!=3);
		 
		
		zmienna.close();
	}

}

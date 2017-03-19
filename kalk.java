package zadanko;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import zadanko.liczenie;
import org.apache.commons.lang3.StringUtils;

public class kalk {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner zmienna = new Scanner(System.in);
		int tmp=1;
		do{
		tmp=1;
		System.out.println("Witaj w kalkulatorze");
		System.out.println("Wpisz 1, aby uruchomic kalkulator 2 aby wykonac działania z pliku 3 aby zakonczyć program");
		 int a = zmienna.nextInt();
		 String pom = null;
		 zmienna.nextLine();
		 
		 if(a==1){
			 do{
			System.out.println("Podaj dzialanie: ");
			 pom=zmienna.nextLine();
			 tmp=liczenie.wynik(pom);
			 }while(!pom.equals("koniec"));
			 
		 }else if(a==2){
			 File plik = new File("obliczenia.txt");
			 Scanner odczyt=new Scanner(plik);
			 while(odczyt.hasNextLine()){
				 pom=odczyt.nextLine();
				 tmp=liczenie.wynik(pom);
				 
			 }
			 
		 }
		 if(a==3)
			 break;
		}while(tmp==0);
		 
		
		
	}

}

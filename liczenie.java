package zadanko;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class liczenie {

public static void wynik(String pom){
	double wynik=0;
	Scanner zmienna = new Scanner(System.in);
	

		 int pom2=0,licznik=0, licznik2=0;
		 int []liczba=new int[1000]; //dalem ograniczona ilosc przechowywania liczb, nie znam jeszcze w javie list
		 char[] znak=new char[1000]; // to samo co powyżej
		 
		
		 
		 if(!pom.equals("koniec")){   //jesli wykryje slowo koniec metoda przestanie dzialac i wroci do menu
		
	
		//w tej petli dziele sobie stringa
		 for(int i=0;i<pom.length();i++){
		
			 
			if(StringUtils.isNumeric(pom.substring(pom2, i))){
				
				if(!StringUtils.isNumeric(pom.subSequence(pom2, i+1))){
				System.out.println("Znaleziona liczba to: "+ pom.substring(pom2, i));
				liczba[licznik]=Integer.parseInt(pom.substring(pom2, i));
				licznik++;
				}
				
				
			}else{
				if(i>0){
				System.out.println("Znak znaleziony to: "+ pom.substring(i-1, i));
				znak[licznik2]=pom.charAt(i-1);
				licznik2++;
				
				}
				pom2=i;
			} // ponizej if przypisuje liczbe, gdyz na koncu zawsze bedzie liczba. Nie mozna zakonczyc znakiem działania
			if(i+1==pom.length()){
				System.out.println("OStastnia liczba:"+ pom.substring(pom2, i+1));
			liczba[licznik]=Integer.parseInt(pom.substring(pom2, i+1));
			licznik++;
			}
			
		 }
		 
//wykonuje obliczenia bez sprawdzania kolejnosci działan matematycznych		 
wynik=liczba[0];
		 for(int i=0;i<licznik2;i++){
			 if( znak[i]=='+' ){
				wynik+=liczba[i+1];
				}else 
					 if( znak[i]=='-'){
						wynik-=liczba[i+1];
					}else 
						 if( znak[i]=='*'){
							wynik*=liczba[i+1];
						}else 
							 if( znak[i]=='/'){
								wynik/=liczba[i+1];
							}
				
			}
		 System.out.println("Wynik to: "+ wynik); //wyswietlam wynik
		 
		 }	 

	
}	

}

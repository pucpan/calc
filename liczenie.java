package zadanko;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class liczenie {

public static int wynik(String pom){
	double wynik=0;
	Scanner zmienna = new Scanner(System.in);
	
//	do{
		 int pom2=0,licznik=0, licznik2=0;
		 int []liczba=new int[1000];
		 char[] znak=new char[1000];
		 
		
		 
		 if(!pom.equals("koniec")){
		 //System.out.println("Wynik to działania:"+pom+"=");
	
		
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
				//System.out.println("Wypisuje to co zapisuje do zmiennej"+ pom.charAt(i-1)+ "licznik2 wynosi: "+licznik2);
				znak[licznik2]=pom.charAt(i-1);
				licznik2++;
				
				}
				pom2=i;
			}
			if(i+1==pom.length()){
				System.out.println("OStastnia liczba:"+ pom.substring(pom2, i+1));
			liczba[licznik]=Integer.parseInt(pom.substring(pom2, i+1));
			licznik++;
			}
			
		 }
		 
		 
		 
	//	 for(int i=0;i<licznik2;i++)
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
		 System.out.println("Wynik to: "+ wynik);
		

		 
	/*	 System.out.println("Wyswietlam zapisane liczby: ");
		 for(int i=0;i<licznik;i++){
			 System.out.println(i+". "+ liczba[i]);
			 
		 }
		 
		 System.out.println("Wyswietlam zapisane znaki: ");			 
for(int i=0;i<licznik2;i++){
System.out.println(i +". "+ znak[i]);					 
		 }
		 */
		 
		 }	 
	// }while(!pom.equals("koniec"));
	
	
	return 0;
}	

}

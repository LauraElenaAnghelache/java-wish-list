package jana60.wishlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Creare una classe Main con metodo main in cui implementare il seguente programma:
Creare una lista dei desideri vuota e chiedere all’utente di aggiungere i suoi desideri uno alla volta, fino a che sceglie di fermarsi.
Ogni volta che viene aggiunto un desiderio stampare a video quanti desideri sono contenuti nella lista in quel momento.
Al termine dell’inserimento stampare a video la lista ordinata.
// ESERCIZIO SESSIONE 3
*/ 
		Scanner scan = new Scanner(System.in);
		ArrayList<String> listaDesideri = new ArrayList<String> ();
		
		boolean flag = true;
		do {
			System.out.println("Benvenuto nella lista dei tuoi desideri, ricorda che puoi esprimere un massimo di tre desideri");
			String scelta;
			boolean flag2 = true;
			do {
				System.out.println("Cosa vuoi fre? Type 1 per inserire un nuovo desidero, 2 per uscire");
				scelta = scan.nextLine();
				if (scelta.equalsIgnoreCase("1") || scelta.equalsIgnoreCase("2")) {
					flag2 = false;
				}
				
				
			}while (flag2);
			switch (scelta) {
			case "1":
				
				if(listaDesideri.size()< 3) {
					System.out.println("Inserisci il tuo desiderio:");
					listaDesideri.add(scan.nextLine());
					System.out.println("Hai espresso" + listaDesideri.size() + "desideri," + "ecco la lista desideri espressi finora:" + listaDesideri);
					
				}else {
					System.out.println("Hai supeato il numero massimo di desideri");
					flag = false;
					
				}break;
				
				default:
					flag = false;
				
				break;
			
			}
		}while (flag);
		Collections.sort(listaDesideri);
		System.out.println("Ecco la lista finale ordinata: " + listaDesideri);
		System.out.println("Torn atrovarci per altri desideri");
		
		scan.close();
			
		}
	} 



package fr.operateurs.console;
import java.util.Scanner;
public class OperateursApp {
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner questionUser = new Scanner(System.in);

		//Saisie du premier nombre
		System.out.println("Veuillez saisir le premier nombre : ");
		a = questionUser.nextInt();
		
		//Saisie du deuxieme nombre
		System.out.println("Veuillez saisir le deuxieme nombre : ");
		b = questionUser.nextInt();
		
		//Addition
		c = a + b;
		System.out.println("Resultat de l'addition des deux nombres : " + c + "\n" );
		
		//Soustraction
		c = a - b;
		System.out.println("Resultat de l'addition des deux nombres : " + c + "\n" );
		
		//Multiplication 
		c = a * b;
		System.out.println("Resultat de l'addition des deux nombres : " + c + "\n" );
		
		//Division, gere le cas / 0
	
   
		try {
			c = a / b;
			System.out.println("Resultat de la division des deux nombres : " + c + "\n" );
		} 
		catch (ArithmeticException e) {
			System.out.println("Erreur, division par 0 impossible");
		}
	  
		//Modulo, gere le cas %0
		try{
			c = a % b;
			System.out.println("Resultat du modulo des deux nombres : " + c + "\n" );
		}
		catch(ArithmeticException e){
			System.out.println("Erreur, modulo 0 impossible");
		}
		
		
		
	}
}

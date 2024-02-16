package controladores;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una palabra");
		String palabra1 = sc.next();
		
		System.out.println("Introduzca otra palabra");
		String palabra2 = sc.next();
		
		String sumaPalabras = palabra1 + " " + palabra2;
		
		System.out.println("concatenación de palabras: " + sumaPalabras);
		System.out.println("Longitud de la cadena: " + sumaPalabras.length() );
		

	}

}

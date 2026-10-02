package Ejer2;

import java.util.Scanner;

public class Bloque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio uno
		
		/*int num = 2;
		int resultado = (num + 77);
		System.out.println(resultado);
		resultado = resultado - 3;
		//resultado-=3;
		System.out.println(resultado);
		
		
		// Ejercicio dos
		
		int variableA = 2;
		int variableB = 4;
		int variableC = 6;
		int variableD = 8;
		
		System.out.println(" Variable A es igual: " + variableA);
		System.out.println(" Variable B es igual: " + variableB);
		System.out.println(" Variable C es igual: " + variableC);
		System.out.println(" Variable D es igual: " + variableD);
		
		variableA = variableB;
		variableB = variableC;
		variableC = variableD;
		variableD = variableA;
		
		System.out.println(" Ahora variable A es igual a B: " + variableA);
		System.out.println(" Ahora variable B es igual a C: " + variableB);
		System.out.println(" Ahora variable C es igual a D: " + variableC);
		System.out.println(" Ahora variable D es igual a A: " + variableD);
		
		
		// Ejercicio 3
		
		// Ejercicio 4
		
		String texto = "Este es el ejercicio cuatro.";
		System.out.println("La longitud de la cadena es: " + texto.length());*/
		
		// Ejercicio 5
		
		
		// Ejercicio 6
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("Dime el dia de nacimiento");
		int dia = input.nextInt();
		
		System.out.println("Dime el mes de nacimiento");
		String mes = input.next();
		
		System.out.println("Dime el año de nacimiento");
		int year = input.nextInt();
		
		System.out.println("Tu fecha de cumpleaños es: " + dia +" de "+ mes +" del "+ year);
		*/
		
		// Ejercicio 7
		
		
		System.out.println("Dame un texto");
		String texto = input.nextLine();
		
		texto=texto.replaceAll(" ", "");
		System.out.println(texto);
		
		// Ejercicio 8
		
		double numeros = 15978;
		
		System.out.println(numeros);
		
		
		
		
		input.close();
		


	}

}

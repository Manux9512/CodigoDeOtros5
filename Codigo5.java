package com.generation;
import java.util.Scanner;
//Se agregó un System.in
//Se cambiaron las comillas sencillas de "Introduca un numero' a comillas dobles " " 
//Se cambio el tipo de variables a int utilizando nextInt()
//Se modificarion los {} en noAfo++
//Se cerro el scanner con .close

public class Codigo5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int ni = s.nextInt();
		int c = ni;

		int afo = 0;
		int noAfo = 0;

		while (ni > 0) {
			int digito = (int) (ni % 10);
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;
			}
			ni /= 10;
		}
		if (afo > noAfo) {
			System.out.println("El " + c + " es un número afortunado.");
		} else {
			System.out.println("El " + c + " no es un número afortunado.");
		}

		s.close();

	}
}
    
  



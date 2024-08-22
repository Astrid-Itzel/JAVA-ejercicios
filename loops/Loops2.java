package com.loops;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		/* NESTED LOOPS
		*  Solicitar n donde: 0 > n <= 100;
		* 2. Utilizar un contador ´number´ a imprimir
		* 3. Loop para filas
		* 4. Loop para columnas
		* 5. Imprimir el número
		*/

		
		Scanner sc = new Scanner(System.in); //llamo a mi escaner y lo nombro sc
		System.out.println("Please enter the number of rows"); //le digo al usuario qué hacer
		int rows = sc.nextInt();//para que lea el siguiente dato entero
	
		
		// 2. Utilizar un contador ´number´ a imprimir
		int numberToPrint = 1;
		
		//3. Loop exterior para filas
		for (int i = 1; i <= rows; i ++) { // se va a detener hasta que sea igual o menor a rows
			//4. Loop interno para columnas
			for (int j = 1; j <= i; j++) {
				//5. Imprimir el número
				System.out.print(numberToPrint + " "); 
				numberToPrint++;
			}
			System.out.println(); //está vacío porque sólo sirve para hace salto de línea y regresa al inicio del loop
		}
		
		sc.close();
		
	}

	}



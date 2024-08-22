package com.loops;

import java.util.Scanner;

public class Loop3diamante {

	public static void main(String[] args) {
		/* NESTED LOOPS
		*  Solicitar n donde: 0 > n <= 100;
		* 2. Utilizar un contador ´number´ a imprimir
		* 3. Loop para filas
		* 4. Loop para columnas
		* 5. Imprimir el número
		*/

		
		Scanner scanner = new Scanner(System.in); //llamo a mi escaner y lo nombro sc
		System.out.println("Please enter the number of rows"); //le digo al usuario qué hacer
		int rows = scanner.nextInt();//para que lea el siguiente dato entero
	
		
		// Parte superior

		// Loop exterior para filas
		for (int i = 1; i <= rows; i ++) { // se va a detener hasta que sea igual o menor a rows
			// Loop interno para columnas
			
			for (int j=0; j<rows-i; j++) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <= i; j++) {
				// Imprimir el número
				System.out.print( "   "+'*'); 
				//numberToPrint++;
			}
			System.out.println(); //está vacío porque sólo sirve para hace salto de línea y regresa al inicio del loop
		}

		// Parte inferior

		// Loop exterior para filas
		for (int i = 0; i <= rows; i ++) { // i empieza siendo el número ingresado de rows-1 (para la punta del diamante), va a contiuar mientras i sea mayor o igual a 1, y va disminuyendo un número en cada ciclo
			// Loop interno para columnas
			
			for (int j = -1; j < i; j++) {
				// Imprimir el número
				System.out.print("  "); 
				//numberToPrint++;
			}
			
			for (int j = rows-i-1; j >0; j--) {
				// Imprimir el número
				System.out.print("   " + '*'); 
				//numberToPrint++;
			}
			System.out.println(); //está vacío porque sólo sirve para hace salto de línea y regresa al inicio del loop
		}


		//////////////////
		
		/*Segunda opción*/
		
		// Parte superior del diamante
		//El primer bucle controla cuántas filas habrá. El índice comienza en 1 y continúa hasta llegar al número de filas que solicita el usuario, sumando 1 más en cada ciclo)
        for (int i = 1; i <= rows; i++) {
            // Espacios en blanco
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior del diamante
        //El primer bucle controla las filas
        for (int i = rows - 1; i >= 1; i--) {
            // Espacios en blanco
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
        
		}//method

		}//class


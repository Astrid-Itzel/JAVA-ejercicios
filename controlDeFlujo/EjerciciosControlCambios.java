package controlDeFlujo;

import java.util.Scanner;

public class EjerciciosControlCambios {

	public static void main(String[] args) {
		

		//Ejecercicio 1
		
		Boolean a = true;
		Boolean b = false;
		
		if (a && b) {
			System.out.println("Ambos son verdaderos");
		} else if (a || b) {
			System.out.println("Sólo uno de los valores es verdadero");
		}else {
			System.out.println("Ninguno de los valores es correcto");
		}
		
		//Ejercicio 2
		
		Boolean c = true;
		
		System.out.println("el valor de c es: " + c);
		System.out.println("el valor contrario de c es: " + !c);
		
		//Ejercicio 3
		
			//instanciar un objeto de tipo scanner
		Scanner scanner = new Scanner (System.in);
		
			//solicitar información al usuario
		System.out.println("Ingresa un número entero");
		
			//Guardar el objeto en una variable
		int numeroIngresado = scanner.nextInt();
		
			//Determinar si el número es positivo, negativo o cero
		if (numeroIngresado > 0) {
			System.out.println("El número es positivo");
		} else if (numeroIngresado < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número no es positivo, ni negativo, es cero");
		}
		
		//Ejercicio 4
		
			//Solicitar información al usuario
		System.out.println("Ingresa tu calificación en formato de letra:");
		
			//Guardar el objeto en una variable
		String calificacion = scanner.next();
		
			//Determinar la calificación
		switch (calificacion) {
		case "A": 
			System.out.println("¡Maravillosa calificación!");
			break;
		case "B":
			System.out.println("¡Bien hecho!");
				break;
		case "C":
			System.out.println("Buen esfuerzo");
			break;
		case "D":
			System.out.println("Sigue esforzándote, puedes hacerlo mejor");
			break;
		case "E":
			System.out.println("Estudia más");
			break;
		case "F":
			System.out.println("Insuficiente");
			break;
		default: 
			System.out.println("La calificación es inválida");
		}
		
		//Ejercicio 5
		
		//Solicitar información al usuario
	System.out.println("Ingresa un número del 1 al 5");
		
	//Guardar el objeto en una variable
	int numero = scanner.nextInt();
	
	//Mensajes
	
	switch(numero){
		case 1:
			System.out.println("Recibiste un mensaje");
			break;
		case 2:
			System.out.println("Diste like");
			break;
		case 3:
			System.out.println("Enviaste un mensaje");
			break;
		case 4:
			System.out.println("Subiste una imagen");
			break;
		case 5:
			System.out.println("Escribiste un nuevo post");
			break;
		default:
			System.out.println("No se completó la acción");
	}
		
		
	//Cerramos scanner
	scanner.close();
		
	} //method

} //class

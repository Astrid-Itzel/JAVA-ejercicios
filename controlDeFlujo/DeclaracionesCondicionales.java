package controlDeFlujo;

import java.util.Scanner;

public class DeclaracionesCondicionales {

	public static void main(String[] args) {
		//Todo debe estar dentro del método main
		//Para que algo se ejecute siempre debe de estar dentro del método principal
		//Primero defino mi variable con el tipo de dato
		
		/*
		 * Scanner: Método de Java que permite solicitar a un 	usuario cualquier tipo de dato
		 * Tenemos que importar la clase Scanner e  instanciar un nuevo objeto de scanner
		 */
		
		//1. Instanciar un objeto de tipo Scanner
		Scanner scanner = new Scanner(System.in);
		//2. Darle contexto al usuario
		System.out.println("Ingresa tu nombre");
		//3. Guardar el objeto Scanner instanciado en una variable, según el tipo de dato que solicitamos.
		String nombre = scanner.next();
		//4. Imprimir el valor de la variable declarada
		System.out.println("Bienvenida, " + nombre);
		//Si queremos solicitar a la usuaria otro dato o información, podemos utilizar el objeto tipo scanner ya instanciado.
		System.out.println("Ingresa tu edad: ");
		int edad = scanner.nextInt();
		
		System.out.println(nombre + " tu edad es de " + edad + " años");
		
		/*
		 * Control de flujo: Sentencias condicionales para controlar el flujo de los programas. if, if else, else if, switch
		 */
		
		// Determinar si una persona es un bebé, un niño o adolescente, un adulto o un adulto mayor.
		
		if (edad >= 18) {
			if (edad < 60) {
				System.out.println("Es un adulto");
			}else {
				System.out.println("Es adulto mayor");
			}
			}else if (edad >= 12){//cierre primer if
				System.out.println("Es un adolescente");
			}else if (edad >= 3) {
				System.out.println("Es un niño");
			}else {
				System.out.println("es un bebé");
			}
		
		
		//Switch Ingresa un número del 1 al 7 para conocer el día de la semana que corresponde
		System.out.println("Ingresa un número del 1 al 7 y ve qué día de la semana corresponde");
		int numeroDia = scanner.nextInt();
		switch (numeroDia) {
		case 1:	
			System.out.println("Lunes, ¡qué aburrición!");
			break;
		case 2:
			System.out.println("Martes loco");
			break;
		case 3:
			System.out.println("Mimimi-miércoles");
			break;
		case 4:
			System.out.println("Juebebes");
			break;
		case 5:
			System.out.println("Viernes de pachanga");
			break;
		case 6:
			System.out.println("Sábado de descanso");
			break;
		case 7:
			System.out.println("¡Dominguo!");
			break;
		default:
			System.out.println("Número inválido");
			break;
		} //termina switch
		
		//Por buena práctica debemos cerrar el scanner
		scanner.close();
		
		/*
		 * Operador ternario es una forma concisa de escribir una declaración if-else. Es específicamente útil cuando tienes una condición simple que quieres evaluar y basar la asignación de un valor en esa condición.
		 */
		
		int hora = 16;
		String operadorTernario = (hora < 20) ? "Buen día" : "Buenas noches";
		System.out.println(operadorTernario);
	}//method

}//class

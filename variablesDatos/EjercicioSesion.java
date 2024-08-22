package variablesDatos;

public class EjercicioSesion {

	public static void main(String[] args) {

		//Booleans
		boolean esDivertido = true;
		boolean javaEsFacil = false;

		
		//byte
		byte minByte = -128;
		byte maxByte = 127;
		
		//char
		char letraA = 'A';
		char letraUnicoide = '\u0041'; //código unicoide para la letra A
		
		//short
		short minShort = -32768;
		short maxShort = 32767;
		
		//int
		int edad = 25;
		int salario = 50000;
		
		//long
		long distanciaTierraSol = 149600000000L; //Nota : 'L' al final para indicar que es un dato long literal, pero en la consola ya no va a aparece esta letra
		
		// float
		float pi = 3.14F; //Nota : 'f' al final para indicar que es un float literal, pero en la consola ya no va a aparece esta letra
		
		//double
		double descuentos = 1.64298;
		
		//Imprimir valores mandándolos llamar
		System.out.println("boolean: " + esDivertido + " , " + javaEsFacil); //tipo de dato más la variable
		System.out.println("Byte: " + minByte + " , " + maxByte); //Byte aquí sí puede ir con mayúscula porque es texto y no el nombre de la variable
		System.out.println("Char: " + letraA + " , " + letraUnicoide);
		System.out.println("Short: " + minShort + " , " + maxShort);
		System.out.println("Int: " + edad + " , " + salario);
		System.out.println("Long: " + distanciaTierraSol);
		System.out.println("Float: " + pi);
		System.out.println("Double: " + descuentos);
		
		/*///////////////////////////////////////////////////////*/
		
		//Conversión de tipos de datos 
		int numeroEntero = 100;
		double numeroDouble = numeroEntero; //Conversión implícita de int a double
		System.out.println("Conversión implícita: " + numeroDouble); //100.0 ya no es un número entero, por eso va a salir en consola con número decimal
		
		
		//Conversión explícita, de double a entero
		double otroDouble = 99.99;
		int otroEntero = (int) otroDouble; //Conversión explícita de double a int
		System.out.println("Conversión explícita " + otroEntero); //Esperamos que le quite los decimales y ahor quede en 99
		
		/*////////////////////////////////////////////////////////*/
		
		//Operadores
		int suma = 5 + 3;
		int resta = 5- 3;
		int multiplicacion = 5 * 3;
		int division = 10 / 2;
		double divisionPunto = 20.0 / 3.0;
		int modulo = 10 % 3;
		
		System.out.println("Suma " + suma);
		System.out.println("Resta " + resta);
		System.out.println("Multiplicación " + multiplicacion);
		System.out.println("División " + division);
		System.out.println("División con punto decimal " + divisionPunto);
		System.out.println("Módulo " + modulo);

		//Operadores comparativos
		boolean esIgual = (5 == 5); //un = asigna valor, dos = para comparar, 3 = es en JS 
		boolean noEsIgual = (5 != 3); // ¿Es true or false que 5 no es igual a 3? Me va a dar true
		boolean mayorQue = (5 > 3); 
		boolean menorQue = (3 < 5);
		boolean mayorOIgualQue = (5 >= 5);
		boolean menorOIgualQue= (3 <= 5);
		
		System.out.println("Igual a: " + esIgual ); //Atajo de teclado: Sysout + control + espacio para autocompletar 
		System.out.println(" No es igual a : " + noEsIgual);
		System.out.println("Mayor que: " + mayorQue);
		System.out.println("Menor que: " + menorQue);
		System.out.println("Mayor o igual que: " + mayorOIgualQue);
		System.out.println("Menor o igual que: " + menorOIgualQue);
		
		
		
		
	}//method

}//class

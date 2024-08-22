package variablesDatos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		//Operadores lógicos
		int edad = 25;
		boolean tieneLicencia = true;
		
		//Condición usando && y !
		if (tieneLicencia && ! (edad < 18)) {
			System.out.println("Puede conducir");
		}else {
			System.out.println("No puede conducir, ¡cuidado!");
		}
		
		//Condición usando ||
		boolean esFeriado = false;
		boolean noEsDiaNormal = true;
		
		if (esFeriado || noEsDiaNormal) {
			System.out.println("Descansito, suelta y ve Netflix");
		}else {
			System.out.println("A trabajar!");
		}
		
		//Ejemplo de autentificación
		boolean usuarioValido = true;
		boolean accesoConcedido = false;
		
		if (usuarioValido && accesoConcedido) {
			System.out.println("Bienvenido al sitio web...");
		}else {
			System.out.println("Acceso denegado, ingrese datos válidos");
		}
		
		
        
		
		
		
		
		
		
		
		
	}//method

}//class

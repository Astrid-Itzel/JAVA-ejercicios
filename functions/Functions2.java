package com.functions;

public class Functions2 {

	/*Método para verificar y probar un correo
	* 
	* método boolean
	* Sólo un @
	* caracteres antes del @
	* caracteres después del @ ->.com / .mx / .net / .org / etc...
	* 
	*/
	
	static boolean emailValidator(String email) {
		int atIndex = email.indexOf('@');//regresa el índice de la primera incidencia del @)
		int dotIndex = email.indexOf('.');//regresa el índice del punto
		
		boolean charBeforeAt = false; //characteres antes del @
		boolean charAfterDot = false;
		boolean charBetweenAtDot = false; 
		
		if (atIndex > 0) charBeforeAt = true; // si el @ no está en índice 1, quiere decir que hay más letras antes 
		if (dotIndex < email.length() - 2) charAfterDot = true; 
		if (dotIndex > atIndex + 1) charBetweenAtDot = true; 
		
		
		return charBeforeAt && charAfterDot && charBetweenAtDot;
	}
	
	
	
	//Podemos refactorizar y hacerlo mucho más pequeño así:
	
	static boolean emailValidatorRefactorizado(String email) {
		int atIndex = email.indexOf('@');//regresa el índice de la primera incidencia del @)
		int dotIndex = email.indexOf('.');//regresa el índice del punto
	
	return atIndex > 0 && dotIndex < email.length() - 2 && dotIndex > atIndex + 1;
	}
	
	
	public static void main(String[] args) {
	
		
		System.out.println(emailValidator("astrid@gmail.com"));
		
		System.out.println(emailValidatorRefactorizado("astrid@gmail.com"));
		
	}

}

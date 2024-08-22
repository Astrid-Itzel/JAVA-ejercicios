package com.functions;

public class Functions {
	
	static double calcAreaCircle(double radio) { //debe regresar un dato double e introducir el radio tambien en double
		return Math.PI * Math.pow(radio, 2);	}//pow eleva el radio al cuadrado (2)
	
	
//Method Overloading
	static String error (String error, String message) {
		return "Error: " + error + "\n Description: " + "\"" + message + "\"";
	}
	
	static String error(String error) {
		return "Error: " + error ;
	}

	
	static void printFilteredNews(String pattern, String[] news) {
		for(String title : news) {
			if(title.contains(pattern)) { //si el título contiene una secuencia que coincida con el parametro, imprímelo
			System.out.println("Noticia: " + title);
			}
		}
	}
	
	public static void main(String[] args) {//método main. Si hay otros métodos deben ir antes de main, main va al final y dentro de éste van las demás funciones.

		
		String[] newsTitles = {"China usaría energía renovable" , "La economía de USA", "Hackers roban 1 millón de BTC", "Nueva batería eléctrica dura más" , "Aprende a programar haciéndolo" };
		
		/*for(String title : newsTitles) {//for each: por cada item que tengo aquí, haz lo siguiente
			System.out.println("Noticia: " + title);
		}*/ //para que imprima todas las noticias
				
		printFilteredNews ("USA", newsTitles);//para que imprima lo que buscas

		
		System.out.println(calcAreaCircle(5.0));//usamos 5.0 porque se estableció que el dato introducido también tendría que ser double.
		System.out.println(error("404", "Resource not found"));
		System.out.println(error("502"));
		
		
	}//method

}//class

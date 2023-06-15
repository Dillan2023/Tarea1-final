package hn.uth.aplicacion_calculadora_areas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "CALCULADORA DE AREAS!" );
        int opcion = 0;
        
        
        while(opcion != 5) {
        	imprimirMenu();
        	opcion = leerEnteroTeclado("");
        	Double resultado = null;
        	if(opcion == 1) {
        		resultado = calcularAreaCirculo(leerDecimalTeclado("INGRESE EL RADIO:"));
        	}else if(opcion == 2) {
        		resultado = calcularAreaCuadrado(leerDecimalTeclado("INGRESE EL LADO:"));

        	}else if(opcion == 3) {
        		resultado = calcularAreaRectangulo(leerDecimalTeclado("INGRESE LA BASE:"),leerDecimalTeclado("INGRESE LA ALTURA:"));

        	}else if(opcion == 4) {
        		resultado = calcularAreaTriangulo(leerDecimalTeclado("INGRESE LA BASE:"),leerDecimalTeclado("INGRESE LA ALTURA:"));

        	}else {
        		System.out.println("Finalizando la aplicación.");
        	}
        	System.out.println("El resultado de la operación es: "+resultado);
        }
    }
    
    private static int leerEnteroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}
	
	private static double leerDecimalTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
	}

	private static void imprimirMenu() {
		System.out.println("*** CALCULADORA ***");
		System.out.println("1. AREA DE UN CIRCULO");
		System.out.println("2. AREA DE UN CUADRADO");
		System.out.println("3. AREA DE UN RECTANGULO");
		System.out.println("4. AREA DE UN TRIANGULO");
		System.out.println("5. SALIR");
		System.out.println("ELIJA UNA OPCIÓN DEL MENÚ:");
	}

	public static double calcularAreaCuadrado(double lado) {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	public static double calcularAreaTriangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return (base * altura) / 2.0;
	}

	public static double calcularAreaRectangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return base*altura;
	}

	public static double calcularAreaCirculo(double radio) {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}

}

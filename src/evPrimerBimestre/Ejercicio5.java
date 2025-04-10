package evPrimerBimestre;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
		
		
		double datoIngresadoPorElUsuario, resultadoRaizCuad;
		
		
		System.out.println("Ingrese un valor para calcular su raiz cuadrada: ");
		
		
		datoIngresadoPorElUsuario = ingreso.nextDouble();
		
		
		resultadoRaizCuad = Math.sqrt(datoIngresadoPorElUsuario) ; // Math.sqrt es un double
		
		int resultadoEntero = (int)  resultadoRaizCuad;
		
		System.out.println( "El valor de la raiz cuadrada es: " + resultadoRaizCuad);
		
		System.out.println("Resultado entero:" + resultadoEntero);
	}
}

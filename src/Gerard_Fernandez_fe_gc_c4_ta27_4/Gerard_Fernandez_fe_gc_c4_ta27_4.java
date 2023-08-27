package Gerard_Fernandez_fe_gc_c4_ta27_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta27_4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calcular = new Calculadora();
        //Este catch atrapara el error de que los valores introducidos no sean numericos
        try {
	        System.out.println("Calculadora simple");
	        System.out.print("Ingrese el primer número: ");
	        double num1 = scanner.nextDouble();
	
	        System.out.print("Ingrese el segundo número: ");
	        double num2 = scanner.nextDouble();
	        System.out.println();
	        
	        //Realiza las operaciones los catch comprueba que se 
	        //respeten la normas de las operaciones
	        try {
	            System.out.println("Suma: " + calcular.sumar(num1, num2));
	            System.out.println("Resta: " + calcular.restar(num1, num2));
	            System.out.println("Multiplicación: " + calcular.multiplicar(num1, num2));
	            System.out.println("Potencia: " + calcular.potencia(num1, num2));
	            System.out.println("Raíz Cuadrada de " + num1 + ": " + calcular.raizCuadrada(num1));
	            System.out.println("Raíz Cúbica de " + num2 + ": " + calcular.raizCubica(num2));
	            System.out.println("División: " + calcular.dividir(num1, num2));
	        } catch (Exception_ta27_4_Division0 e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception_ta27_4_NumNegativo e) {
	        	System.out.println("Error: " + e.getMessage());
	        }
	        
	    //Utilización de un Exception de la API JAVA 8
        } catch (InputMismatchException e) {
        	System.out.println("Error: Se esperaban tan solo numeros no caracteres");
		}
        scanner.close();
    }
}

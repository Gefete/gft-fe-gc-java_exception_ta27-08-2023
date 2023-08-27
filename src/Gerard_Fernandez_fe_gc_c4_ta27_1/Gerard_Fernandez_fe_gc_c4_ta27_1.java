package Gerard_Fernandez_fe_gc_c4_ta27_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta27_1 {
	public static void main(String[] args) {
        NumAdivinar juego = new NumAdivinar(1, 500);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de adivinar el número!");
        System.out.println("Introduzca números entre el 1 y 500.");

        boolean adivinado = false;
        int intentos = 0;

        while (!adivinado) {
            System.out.print("Introduce un número: ");
            try {
                int numeroUsuario = scanner.nextInt();
                intentos++;

                if (juego.adivinar(numeroUsuario)) {
                    adivinado = true;
                    System.out.println("Has acertado el número en " + intentos + " intentos.");
                } else {
                	String mensaje="";
                	if(juego.esMayor(numeroUsuario)) {
                		mensaje = "El número introducido es MAYOR al que se busca.";
                	}else {
                		mensaje = "El número introducido es MENOR al que se busca.";
                	}
                    System.out.println(mensaje);
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Entrada no computable, recuerde que tienen que ser numeros del 1 al 500");
            }
        }

        scanner.close();
    }
}

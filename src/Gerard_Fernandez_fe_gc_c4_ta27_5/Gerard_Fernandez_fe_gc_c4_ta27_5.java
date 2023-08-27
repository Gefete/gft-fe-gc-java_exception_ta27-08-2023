package Gerard_Fernandez_fe_gc_c4_ta27_5;

import java.util.Scanner;

public class Gerard_Fernandez_fe_gc_c4_ta27_5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce cuantas contraseñas quieres: ");
        int tamanyo = scanner.nextInt();
        Password[] passwords = new Password[tamanyo];

        System.out.print("Introduce la longitud de caracteres: ");
        int longitud = scanner.nextInt();

        for (int i = 0; i < tamanyo; i++) {
            passwords[i] = new Password(longitud);
        }

        boolean[] esFuerteArray = new boolean[tamanyo];

        for (int i = 0; i < tamanyo; i++) {
            esFuerteArray[i] = passwords[i].esFuerte();
        }

        System.out.println("Contraseñas generadas y si son fuertes o no:");
        for (int i = 0; i < tamanyo; i++) {
            System.out.println(passwords[i].getContrasenya() + " " + esFuerteArray[i]);
        }

        scanner.close();
    }
}

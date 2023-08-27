package Gerard_Fernandez_fe_gc_c4_ta27_3;

import java.util.Random;

public class Gerard_Fernandez_fe_gc_c4_ta27_3 {
	public static void main(String[] args) {
        Random random = new Random();
        
        // Aleatorio entre 0 y 999
        int numeroAleatorio = random.nextInt(1000);  

        System.out.println("Generando número aleatorio...");
        System.out.println("El número aleatorio generado es: " + numeroAleatorio);

        try {
            if (numeroAleatorio % 2 == 0) {
            	//Salta el Objeto exception de par
                throw new Exception_ta27_3_par();
            } else {
            	//Salta el Objeto exception de impar
            	throw new Exception_ta27_3_impar();
            }
        //Segun el error que atrape mostrara o uno o el otro
        } catch (Exception_ta27_3_par e) {
            System.out.println(e.getMessage());
        } catch ( Exception_ta27_3_impar e) {
        	System.out.println(e.getMessage());
        }
    }
}

package Gerard_Fernandez_fe_gc_c4_ta27_2;

import ExceptionCustom.Exception_ta27_2;

public class Gerard_Fernandez_fe_gc_c4_ta27_2 {
	public static void main(String[] args) {
        try {
            System.out.println(" -- Mensaje mostrado por pantalla -- ");
            throw new Exception_ta27_2("Esto es un objeto Exception");
        } catch (Exception_ta27_2 e) {
            System.out.println("Excepcion capturada con mensaje: " + e.getMessage());
        }

        System.out.println("Programa terminado");
    }
}

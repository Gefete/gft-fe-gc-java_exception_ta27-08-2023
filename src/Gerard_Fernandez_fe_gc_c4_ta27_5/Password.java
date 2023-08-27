package Gerard_Fernandez_fe_gc_c4_ta27_5;

import java.util.Random;

public class Password {
	
	private int longitud;
	private String contrasenya;

    public Password() {
        longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    
    public void generarPassword() {
        Random random = new Random();
        contrasenya ="";

        for (int i = 0; i < longitud; i++) {
            int tipo = random.nextInt(3);  
            char letter;
            //Si es mayus
            if(tipo==0) {
            	letter = (char) (random.nextInt(26) + 65);
            //Si es minus
            }else if(tipo==1) {
            	letter = (char) (random.nextInt(26) + 97);
            //si no es num
            }else {
            	letter = (char) (random.nextInt(10)+48);
            }

            contrasenya+=letter;
        }
    }
    
    public boolean esFuerte() {
        int mayus = 0;
        int minus = 0;
        int num = 0;

        for (int i = 0; i < contrasenya.length(); i++) {
            char c = contrasenya.charAt(i);

            if (Character.isUpperCase(c)) {
                mayus++;
            } else if (Character.isLowerCase(c)) {
                minus++;
            } else if (Character.isDigit(c)) {
                num++;
            }
        }

        return mayus >= 2 && minus >= 1 && num >= 5;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public int getLongitud() {
        return longitud;
    }
    
    public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}

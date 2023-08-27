package Gerard_Fernandez_fe_gc_c4_ta27_4;

public class Calculadora {
	
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

   
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

  
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

 
    public double dividir(double num1, double num2) throws Exception_ta27_4_Division0 {
        if (num2 == 0) {
            throw new Exception_ta27_4_Division0("Dividir por cero no es posible");
        }
        return num1 / num2;
    }

   
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

 
    public double raizCuadrada(double num) throws Exception_ta27_4_NumNegativo {
        if (num < 0) {
            throw new Exception_ta27_4_NumNegativo("imposible calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(num);
    }

 
    public double raizCubica(double num) {
        return Math.cbrt(num);
    }
}

package Gerard_Fernandez_fe_gc_c4_ta27_1;

public class NumAdivinar {
	private int numeroAdivinar;

    public NumAdivinar(int min, int max) {
        numeroAdivinar = (int) (Math.random() * (max - min + 1)) + min;
    }

    public boolean adivinar(int numero) {
        return numero == numeroAdivinar;
    }

    public boolean esMayor(int numero) {
        return numero > numeroAdivinar;
    }
}

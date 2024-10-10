

public class NumerosAleatorios {
    public static void main(String[] args) {
        int aleatorio = (int) (0 + Math.random() * (30-0 +1));
        while (aleatorio<25) {
            System.out.println("Numero Aleatorio: " + aleatorio);
            aleatorio = (int) (0 + Math.random() * (30-0 +1));
        }

    }
    
}

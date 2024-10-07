import java.util.Scanner;

public class TemperaturaCorporal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temperatura;
        System.out.println("Introduzca la temperatura: ");
        temperatura = teclado.nextDouble();

        if ((temperatura < 34) || (temperatura > 41)) {
            System.out.println("Vuelva a tomar la temperatura, posible error");

        } else if ((temperatura > 34.1) && (temperatura < 37.1)) {
            System.out.println("Temperatura correcta");

        } else if ((temperatura >37.2) && (temperatura < 38.3)) {
            System.out.println("Acuda al médico, puede estar enfermo");
        } else if ((temperatura > 38.4) && (temperatura < 40.9)) {
            System.out.println("URGENTE: acuda al médico");
        }
    }
}

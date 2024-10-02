import java.util.Scanner;

public class ConversorTiempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el tiempo en segundos: ");
        int segundos = teclado.nextInt();

        int horas = segundos / 3600;
        int min = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        
        System.out.println("El tiempo es :" + horas + min + segundosRestantes);

    }
}

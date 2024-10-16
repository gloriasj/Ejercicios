import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        int num;
        int total=0;
        int contador=0;
        double media;
        Scanner teclado = new Scanner(System.in);

        while (total <=1000) {
            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
            total +=num;
            System.out.println("TOTAL NUMEROS ACUMULADOS: " + total);
            contador ++;
            System.out.println("CANTIDAD DE NUMEROS INTRODUCIDOS " + contador);
            
        }
        media = total/contador;
        System.out.println("MEDIA DE LOS NUMEROS INTRODUCIDOS " + media);


    }
}
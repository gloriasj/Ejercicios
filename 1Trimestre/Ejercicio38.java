import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num=teclado.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); //SALTO EN LINEA
        }

    }

    
}
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura para crear la piramide: ");
        altura= teclado.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j < altura -1 ; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= (2 * i -1); j++) {
                System.out.print(" * ");
            }
           
        }
             //SALTO DE LINEA
       System.out.println();

        
    }
        
}

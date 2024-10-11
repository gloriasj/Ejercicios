import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        numero=teclado.nextInt();

        for(int i= 1; i<=10; i++){
            System.out.println(numero + (numero*i));
        }
    }
}

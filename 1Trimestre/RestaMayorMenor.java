import java.util.Scanner;

public class RestaMayorMenor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // DECLARACION VARIABLES
        int num1, num2;
        int resta;
        System.out.println("Introduce un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce un numero: ");
        num2 = teclado.nextInt();

        // RESTA DEL MENOR AL MAYOR
        if (num1 > num2) {
            resta = num1 - num2;
            System.out.println("La operacion de la resta es: " + resta);

        } else if (num1 < num2) {
            System.out.println("La operacion no se puede realizar");
        }
        // NO REALIZAR RESTA SI LOS NUMEROS SON IGUALES
        else if (num1 == num2) {
            System.out.println("Los numeros son iguales, no se puede realizar la operacion");

        }

    }
}
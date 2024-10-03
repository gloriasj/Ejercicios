import java.util.Scanner;

public class NumMayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingresa el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = teclado.nextInt();

        if (num1>num2) {
            System.out.println("EL NUMERO MAYOR ES: " + num1);
        }else{
            System.out.println("EL NUMERO MENOR ES: " + num2);
        }
    }
}

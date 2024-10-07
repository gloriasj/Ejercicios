import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero del 1 al 7: ");
        num= teclado.nextInt();

        if (num == num) {
            System.out.println("El dia correspondiente es: " + num);
        }else(num !=num){
            System.out.println("No es el dia correspondiente");
        }
    }
}

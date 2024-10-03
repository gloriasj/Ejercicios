import java.util.Scanner;
public class NumParDivisible {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();

        //CONDICION PAR O IMPAR
        if (num % 2 == 0) {
            System.out.println("EL NUMERO  " + num + " ES PAR");
            
        }else{
            System.out.println("EL NUMERO " + num + " ES IMPAR");

        }
        //CONDICION SI ES DIVISIBLE O NO 
        if (num % 5 == 0) {
            System.out.println("EL NUMERO " + num + " ES DIVISIBLE");
        }else{
            System.out.println("EL NUMERO " + num + " NO ES DIVISIBLE ");
        }

    }
}

import java.util.Scanner;;
public class NumPosNeg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num;
        System.out.println("Introduce un numero: ");
        num= teclado.nextDouble();

        if (num>0) {
            System.out.println("El numero es positivo");
            
        }else if (num<0) {
            System.out.println("El numero es negativo");
        }
    }
}
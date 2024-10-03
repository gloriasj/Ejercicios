import java.util.Scanner;;
public class OrdenadoMayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce el primero numero: ");
        num1= teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2= teclado.nextInt();

        if (num1 > num2) {
            System.out.println("Orden de mayor a menor: " + num1 + " y " + num2);
            
        }else{
            System.out.println("Orden de mayor a menor: " + num2 + " y " + num1);
        }
    }
}

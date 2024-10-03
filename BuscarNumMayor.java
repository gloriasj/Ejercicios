import java.util.Scanner;
public class BuscarNumMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Introduce el primer numero: ");
        num1= teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2= teclado.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3= teclado.nextInt();

        if (num1 > num2 && num1 >num3) {
            System.out.println("El numero mayor es: " + num1);
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es:" + num2);
            
        }else if (num3 > num1 && num3>num2) {
            System.out.println("El numero mayor es:" + num3);
            
        }else if (num1 == num2 && num2 ==num3) {
            System.out.println("Los numeros son iguales");
            
        }
    
    }
}

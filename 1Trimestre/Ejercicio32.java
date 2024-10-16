import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        int num1, num2;
        int operaciones;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1=teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2=teclado.nextInt();
        
        

do {
    System.out.println("----MENU PRINCIPAL----");
    System.out.println("1. Suma:");
    System.out.println("2. Resta:");
    System.out.println("3. Multiplicacion:");
    System.out.println("4. Division:");
    System.out.println("0. SALIR");
    operaciones= teclado.nextInt();
    switch (operaciones) {
        case 1:
            System.out.println("Solucion de la suma: ");
            System.out.println((num1 + num2));
            break;
        case 2:
            System.out.println("Solucion de la resta: ");
            System.out.println(num1-num2);
            break;
        case 3:
            System.out.println("Solucion de la multiplicacion: ");
            System.out.println(num1*num2);
            break;
        case 4:
            System.out.println("Solucion de la division: ");
            System.out.println(num1/num2);

    
        default:
            System.out.println("No se puede mostrar ninguna operacion");
            break;
    }
} while(operaciones !=0);
}
}
           
        
           




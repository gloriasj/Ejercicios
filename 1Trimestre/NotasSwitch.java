import java.util.Scanner;
public class NotasSwitch {
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una nota del 1 al 10: ");
        nota= teclado.nextInt();

        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
            System.out.println("Suspenso");
            break;
            case 5:
            System.out.println("Suficiente");
            break;
            case 6: 
            System.out.println("Notable");
            break;
            case 7:
            System.out.println("Notable");
            case 8:
            System.out.println("Notable");
            case 9:
            System.out.println("Sobresaliente");
            case 10:
            System.out.println("Sobresaliente");
        
            default:
                System.out.println("No se puede mostrar nota");
                break;
        }
    }
}

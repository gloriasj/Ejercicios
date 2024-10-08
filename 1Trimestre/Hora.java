
import java.util.Scanner;
public class Hora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora;
        System.out.println("Indique la hora: ");
        hora=teclado.nextInt();

        if ((hora >= 6) && (hora<=12)) {
            System.out.println("BUENOS DIAS");
        }else if ((hora >= 13) && (hora<=20)){
            System.out.println("BUENAS TARDES");
        }else if ((hora >=21) && (hora <=5)) {
            System.out.println("BUENAS NOCHES");
        }else{
            System.out.println("No se puede indicar nada");
        }
    }
}

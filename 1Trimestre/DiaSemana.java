import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero del 1 al 7: ");
        num= teclado.nextInt();
        if(num ==1){
            System.out.println("LUNES");
        }else if (num == 2){
            System.out.println("MARTES");
        }else if (num==3) {
           System.out.println("MERCOLES"); 
        }else if (num == 4) {
            System.out.println("JUEVES");
        }else if (num==5) {
            System.out.println("VIERNES");
        }else if (num == 6) {
            System.out.println("SABADO");
        }else if (num == 7){
            System.out.println("DOMINGO");
        }else{
            System.out.println("No existe ningun dia de la semana");
        }

    
}
}
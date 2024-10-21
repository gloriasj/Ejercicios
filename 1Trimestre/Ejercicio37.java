import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        int num;
        int aleatorio = (int) (Math.random() * 10+1);
        int oportunidades = 5;
       System.out.println("EL NUMERO ALEATORIO ES: " + aleatorio);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10:");
        num= teclado.nextInt();
       while (oportunidades>0) {
    for (int i = 0; i <=10; i++) {
        
        if (num !=oportunidades) {
            break;
            System.out.println("No es el numero, introduzca otros:");
            num=teclado.nextInt();
            oportunidades --;
        }else{
            System.out.println("Has acaertado: ");
            oportunidades=0;
        }
       
    }
    }
}
}




import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int num;
        int aleatorio= (int) (100 + Math.random() * (999-100+1));
        int intentos=5;
        System.out.println("E numero aleatorios es:" + aleatorio);
        Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca un numero:");
            num=teclado.nextInt();
            

            while (intentos>0){
                if (num !=aleatorio) {
                    System.out.println("No es el numero, intentar otra vez");
                    num=teclado.nextInt();
                    intentos --;
                }else {
                    System.out.println("Has acertado el numero");
                    intentos=0;
                }
            }

    }
}


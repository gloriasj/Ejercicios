import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int num;
        int aleatorio= (int) + (Math.random() * (100+900));
        int intentos=5;
        Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca un numero:");
            num=teclado.nextInt(intentos);
           
            for (int i=1; i<intentos; i++){
                System.out.println(i);
                int usuario= teclado.nextInt();

                if (intentos != usuario) {
                    System.out.println("Se ha terminado el numero de intentos");
                }else if(usuario == intentos){
                    System.out.println("Enhorabuena has acertado el numero");
                }
            }
        }

    }


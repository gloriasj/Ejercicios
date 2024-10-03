import java.util.Scanner;

public class NombreEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Ingresa el nombre: ");
         nombre = teclado.nextLine();

        System.out.println("Ingresa la edad: ");
         edad = teclado.nextInt();

        System.out.println("Nombre: " + nombre + " edad: " + edad);
        
    }
    
}

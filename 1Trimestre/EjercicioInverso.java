import java.util.Scanner;

public class EjercicioInverso {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        int []num = new int[10];


        for (int i = 0; i < num.length; i++) {
            System.out.println(i +1);
            num[i]= teclado.nextInt();
        }

       

        for (int i = 0; i >= 0; i--) {
            System.out.println(num[i]);
        }

    }

}

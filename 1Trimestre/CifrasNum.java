import java.util.Scanner;
import java.lang.Math;

public class CifrasNum {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero entre 0  99");
        num= teclado.nextInt();
        
        int num1 = Math.abs(num);
        if (num == 0){
            System.out.println("Contiene una cifra");
        }else{
            System.out.println("El numero contiene dos cifras");
        }
    }
}
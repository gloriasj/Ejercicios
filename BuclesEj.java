package Ejercicios;

public class BuclesEj {
    public static void main(String[] args) {
        int valor = 0;
        int aleatorio= (int) (Math.random()* 10+1);
        while (valor <10) {
            valor ++;
            System.out.println("Valor: " + valor);
            aleatorio= (int) (Math.random() * 10 +1);
            
        }

        do{
            valor ++;
            System.out.println("Valor: " + valor);

        }while(valor<10);
    }
    
}

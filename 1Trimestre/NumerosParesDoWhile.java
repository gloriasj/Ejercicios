public class NumerosParesDoWhile {
    public static void main(String[] args) {
        int valor =1;
        do{
            if (valor %2 == 0) {
                System.out.println(valor);
                
            }
            valor ++;
        }while(valor<=100);
    }
}

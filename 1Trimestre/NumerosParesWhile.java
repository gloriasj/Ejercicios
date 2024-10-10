public class NumerosParesWhile{
    public static void main(String[] args) {
        int valor = 1;
        while (valor <=100) {
            if(valor %2 == 0){
                System.out.println(valor);
            }
            valor ++;
        }
        
    }
}
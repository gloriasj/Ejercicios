public class NumerosParesFor {
    public static void main(String[] args) {
        //PRIMERA FORMA DE SACAR LOS NUMEROS PARES
        for( int i =1; i<=100;i ++){
            if(i %2 == 0){
                System.out.println(i);

            }
        }

        //SEGUNDA FORMA DE SACAR LOS NUMEROS PARES
        for(int x =0; x<=100; x+=2){
            System.out.println(x);
        }

       
    }
}

public class Ejercicio33 {
    public static void main(String[] args) {
       int sumPares = 0;
       int sumImpar =0;

    for (int i = 1; i < 40; i++) {
        if (i %2 ==0) {
           sumPares +=i;
        }
        
    }
    for (int i = 1; i <40; i++) {
        if (i %2 !=0) {
            sumImpar +=i;
        }
    }
    System.out.println("La suma de los numeros impares son: " + sumImpar);
    System.out.println("La suma de los numeros pares es: " + sumPares);
}

    
}
    

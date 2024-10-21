public class EjercicioArray {
    public static void main(String[] args) {
        //DECLARACIÓN DE ARRAY
        int[] num = new int[10];

        //ASIGNAR VALORES
        num[0]=39;
        num[1]=4;
        num[4]= -5;
        num[8]=32;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}

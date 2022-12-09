
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int opc = 0;
        int c = 0;
        int dim=solicitardimension();
        int [] arraye = new int[dim];
        do {
        System.out.println("""
                
                Por favor, seleccione una opción:
                0. Salir
                1. Inicializar el array aleatoriamente
                2. Comprobar si es múltiplo de 3 y 5 a la vez
                3. Indicar el número de negativos que hay
                4. Verificar si el array es capicúa""");
            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 0:

                    break;
                case 1:
                    arraye = inicializar(arraye);
                    System.out.println("El array creado es: "+Arrays.toString(arraye));
                    c++;
                    break;
                case 2:
                    if (c != 0) {
                        imprimir_multiplos(arraye);
                    } else {
                        System.out.println("Por favor inicialice el array primero.");
                    }

                    break;
                case 3:
                    if (c != 0) {
                        números_negativos(arraye);
                    } else {
                        System.out.println("Por favor inicialice el array primero.");
                    }

                    break;
                case 4:
                    if (c != 0) {
                        es_capicua(arraye);
                    } else {
                        System.out.println("Por favor inicialice el array primero.");
                    }

                    break;
                default:
                    System.out.println("Por favor, introduzca una opción válida.");

            }


        }while ( opc >=1 && opc <=4);
        System.out.println("Hasta la próxima.");



    }
    private static int solicitardimension (){
        int a=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Por favor introduzca la dimensión del array.");
            a = sc.nextInt();
            if (a<=0){
                System.out.println("Por favor introduzca una dimensión válida");
            }

        } while (a<=0);


        return a;
    }
    private static int [] inicializar (int [] arraye){

        for (int i = 0 ; i <arraye.length;i++){
            arraye[i]= (int) (Math.random()*((200-(-200))+i)-200);
        }
        return arraye;
    }
    private static void imprimir_multiplos (int [] arraye){
        int a = 0;
        for (int i = 0 ; i <arraye.length;i++){
            if (arraye[i] % 3 == 0 && arraye[i] % 5 == 0){
                System.out.printf("\u001B[31m"+arraye[i]+" es un múltiplo de 3 y de 5\u001B[0m\n");
                a++;
            }
        }
        if (a ==0){
            System.out.println("No hay números que sean múltiplos de 3 y de 5 al mismo tiempo.");
        }
    }
    private static void números_negativos (int [] arraye){
        int a = 0;
        for (int i = 0 ; i <arraye.length;i++){
            if (arraye[i] < 0){
                a++;
            }
        }
        System.out.println("Hay un total de "+a+" números negativos.");
    }
    private static void es_capicua (int [] arraye){
        int [] inv = new int[arraye.length];
        int j = 0;
        int b = arraye.length-1;
        for (int i = b ; i >= 0;i--){
            inv[j]=arraye[i];
            j++;
        }

        if (Arrays.equals(arraye,inv)){
            System.out.println("Es capicúa.");
        }else {
            System.out.println("No es capicúa.");
        }
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int dim=solicitardimension();
        System.out.println("El valor introducido es "+dim+".");
        float [] arrayfloat = new float[dim];
        int c = 0;
  int opc = 0;

        do {

            System.out.println("""
                    
                    Por favor seleccione una de las siguientes opciones:
                    0. Salir
                    1. Inicializar
                    2. Imprimir el valor máximo y su posición
                    3. Buscar un valor en el array
                    4. Calcular media
                    5. Imprimir array""");

            Scanner sc = new Scanner(System.in);
            opc = sc.nextInt();

            switch (opc) {
                case 0:

                    break;
                case 1:
                    arrayfloat = inicializar(arrayfloat);
                    c++;
                    break;
                case 2:
                    if (c != 0) {
                        System.out.println("El valor máximo del array es " + buscar_maximo(arrayfloat)[0] + " y se encuentra en la posición " + buscar_maximo(arrayfloat)[1] + ".");
                    } else {
                        System.out.println("Por favor inicialice el array primero.");
                    }

                    break;
                case 3:
                    if (c != 0) {
                        System.out.println("Introduzca el número a buscar en el array.");
                        float num = sc.nextFloat();
                        System.out.println("Se encuentra en la posición " + buscar_posición(arrayfloat, num));
                    } else {
                        System.out.println("Por favor inicialice el array primero.");
                    }

                    break;
                case 4:
                    if (c != 0) {
                        imprimir_resultado(arrayfloat);
                    } else {
                        System.out.println("Por favor inicialice el array primero.");
                    }

                    break;
                case 5:
                    if (c != 0) {
                        imprimir(arrayfloat);
                    } else {
                        System.out.println("Por favor inicialice el array primero.");
                    }

                    break;
                default:
                    System.out.println("Has seleccionado una opción inválida.");
                    break;

            }

        }while ( opc >=1 && opc <=5);
        System.out.println("Hasta la próxima.");






    }

    private static int solicitardimension (){
        int a=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Por favor introduzca un número entero mayor que 0 y menor o igual que 10.");
            a = sc.nextInt();
            if (a<=0 || a>10){
                System.out.println("Por favor introduzca un número en ese intervalo.");
            }

        } while (a<=0 || a>10);


        return a;
    }
    public static float [] inicializar (float [] arrayfloat){
        float a =0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i <arrayfloat.length;i++){
            System.out.println("Introduzca el valor del "+ord(i)+".");
            a= sc.nextFloat();
            arrayfloat[i]=a;
        }
        return arrayfloat;
    }
    private static int buscar_posición (float [] arrayfloat, float num){
        int pos = 0;
        for (int i = 0 ; i <arrayfloat.length;i++){
            if (num==arrayfloat[i]){
                pos = i;
            }
        }
        return pos;
    }
    private static float [] buscar_maximo (float [] arrayfloat){
        float [] maxpos = new float[2];
        float max = 0;
        float a = 0;
        float pos = 0;

        for (int i = 0 ; i <arrayfloat.length;i++){
            a = arrayfloat[i];
            if (a>=max){
                max = a;
                pos = i;
            }
        }
        maxpos[0]= max;
        maxpos[1]= pos;
        return maxpos;
    }
    private static void imprimir (float [] arrayfloat){
        System.out.println(Arrays.toString(arrayfloat));
    }

    private static float calcular_media (float [] arrayfloat){
        float media = 0;
        float res = 0;
        for (int i = 0 ; i <arrayfloat.length;i++){
            res = res + arrayfloat[i];
        }
        media = res/(arrayfloat.length);
        return media;
    }
    private static void imprimir_resultado (float [] arrayfloat){
        System.out.println("La media de los valores es: "+calcular_media(arrayfloat));
    }

    private static String ord (int i){
        String num = "";
        Ordinales ord = Ordinales.primero;
        switch (i){
            case 0:
                num = Ordinales.primero.name();
                break;
            case 1:
                num = Ordinales.segundo.name();
                break;
            case 2:
                num = Ordinales.tercero.name();
                break;
            case 3:
                num = Ordinales.cuarto.name();
                break;
            case 4:
                num = Ordinales.quinto.name();
                break;
            case 5:
                num = Ordinales.sexto.name();
                break;
            case 6:
                num = Ordinales.séptimo.name();
                break;
            case 7:
                num = Ordinales.octavo.name();
                break;
            case 8:
                num = Ordinales.noveno.name();
                break;
            case 9:
                num = Ordinales.décimo.name();
                break;



        }
        return num;

    }
}

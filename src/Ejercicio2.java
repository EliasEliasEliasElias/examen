
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String [][] nombres = new String[3][2];
        Scanner sc = new Scanner(System.in);
        String nombre ="";
        int n = 0;
        String opc = "";

        nombres= inicializar(nombres);
        imprimir(nombres);
        System.out.println("\nEn total, se paga por comunidad "+cuotas_comunidad());
        System.out.println("¿Desea saber si algún vecino en la comunidad con un nombre en específico? (s/n)");
        opc = sc.next().toLowerCase();

        if (opc.equals("s")) {
            System.out.println("\nIntroduzca el nombre que desea buscar:");
            nombre = sc.next();
            n = buscar_vecino(nombres,nombre);
            if (n > 0){
                System.out.println("El número de vecinos llamad@s "+nombre.toUpperCase()+" es "+buscar_vecino(nombres,nombre));
            } else {
                System.out.println("No hay nadie con ese nombre en esta comunidad.");
            }

        } else {

            System.out.println("Hasta la próxima.");
        }


    }
    public static String [][] inicializar (String [][] arrayn){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<arrayn.length;i++){
            for (int j  = 0; j<arrayn[i].length;j++){
                if (j == 0){
                    System.out.println("Introduzcame el nombre del "+ord(i)+" A.");
                    arrayn[i][j] = sc.next();
                }else {
                    System.out.println("Introduzcame el nombre del "+ord(i)+" B.");
                    arrayn[i][j] = sc.next();
                }

            }
        }
        return arrayn;
    }
    private static void imprimir (String [][] arrayn){
        for (int i = 0; i<arrayn.length;i++){
            for (int j  = 0; j<arrayn[i].length;j++){
                if (j == 0){
                    System.out.println("El nombre del propietario del "+ord(i)+" A es "+arrayn[i][j].toUpperCase());

                }else {
                    System.out.println("El nombre del propietario del "+ord(i)+" B es "+arrayn[i][j].toUpperCase());
                }
            }
        }
    }

    private static double cuotas_comunidad (){
        double p1 = 50.25;
        double p2 = 78.15;
        double p3 = 96.4;
        double res = (p1*2)+(p2*2)+(p3*2);
        return res;
    }
    private static int buscar_vecino (String [][] arrayn, String nombre){
        String nom = nombre.toLowerCase();

        int a = 0;
            for (int i = 0; i<arrayn.length;i++){
                for (int j  = 0; j<arrayn[i].length;j++){
                    if (nom.equals(arrayn[i][j].toLowerCase())){
                        a++;
                    }
                }
            }
        return a;
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

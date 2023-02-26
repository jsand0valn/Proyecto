package proyectoprogramacion1;

// definir la clase de estudiantes
import java.util.Scanner;

public class Estudiantes {

    //crear los atributos
    static int[] cedula = new int[10];
    static float[] promedio = new float[10];
    static String[] nombre = new String[10];
    static String[] condición = new String[10];
    static int campo = 0;
//crear el constructor para inicializar las variables

    public Estudiantes() {
    }

    //Inicializar/formatear los valores desde 0
    public static void inicializar() {
        for (int i = 0; i < cedula.length; i++) {
            cedula[i] = 0;
            nombre[i] = "";
            promedio[i] = 0;
            condición[i] = "";

        }
        System.out.println("'Los valores se inicializaron'");
    }

    //Agregar los datos de los 10 estudiantes
    public static void Incluir_estudiantes() {

        Scanner reader = new Scanner(System.in);

        char continuar = ' ';
        do {
            if (campo > 10) {
                System.out.println("La lista esta llena");
            } else {
                System.out.println("Ingrese la cedula del estudiante:");
                cedula[campo] = reader.nextInt();
                System.out.println("Ingrese el nombre del estudiante:");
                nombre[campo] = reader.next();
                System.out.println("Ingrese el promedio del estudiante:");
                promedio[campo] = reader.nextInt();
                if (promedio[campo] >= 70) {//condición del estudiante
                    condición[campo] = "APROBADO";
                } else if (promedio[campo] < 60) {
                    condición[campo] = "REPROBADO";
                } else if ((promedio[campo] < 70) && (promedio[campo] >= 60)) {
                    condición[campo] = "APLAZADO";
                }
                campo++;
                System.out.println("¿Desea agregar otro estudiante? Si(s)   No(n)");
                continuar = reader.next().charAt(0);

            }
        } while (continuar != 'n');
    }

    public static void Imprimir_estudiantes() {
        for (int i = 0; i < campo; i++) {
            System.out.println("Cedula: " + cedula[i] + "\n" + "Nombre: " + nombre[i] + "\n" + "Promedio: " + promedio[i] + "\n" + "condicion: " + condición[i] + "\n");
        }

    }//consultar estudiantes

    public static void Buscar_estudiantes() {//Consultar los datos por medio de la cedula
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor, ingrese la cedula del estudiante: ");
        int ID = reader.nextInt();
        for (int i = 0; i < cedula.length; i++) {
            if (ID == cedula[i]) {
                System.out.println("Cedula: " + cedula[i] + "\n" + "Nombre: " + nombre[i] + "\n" + "Promedio: " + promedio[i] + "\n" + "condicion: " + condición[i] + "\n");
            }
        }
    }
}

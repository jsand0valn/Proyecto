
package proyectoprogramacion1;

import java.util.Scanner;

public class ProyectoProgramacion1 {

   
    public static void main(String[] args) {
     menuprincipal();  
    }
    
public static void menuprincipal() { //MENU PRINCIPAL 
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {

            System.out.println("1-Inicializar Vectores");
            System.out.println("2-Incluir Estudiantes");
            System.out.println("3-Consultar Estudiantes");
            System.out.println("4-Modificar Estudiantes");
            System.out.println("5-Eliminar Estudiantes");
            System.out.println("6-Submenu Reportes");
            System.out.println("7-Salir");
            System.out.println("Digite una opcion: ");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1: inicializarvectores();
                    break;
                case 2: Incluirestudiantes();//Incluir Estudiantes
                    break;
                case 3: //Consultar Estudiantes
                    break;
                case 4: //Modificar Estudiantes
                    break;
                case 5: //Eliminar Estudiantes
                    break;
                case 6: //Submenu Reportes
                    break;
                case 7:
                    System.out.println("Usted salio del programa");//SALIR DEL PROGRAMA 
                    break;
            }
        } while (opcion != 7);
    }

    public static void inicializarvectores() {
        int estudiantes [] = new int [0];
        int estudiante;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes:");
        estudiante = reader.nextInt();
        System.out.println("La cantidad de estudiantes ingresados es: " + estudiante);
    }
    public static void Incluirestudiantes(){
     int cedula,promedio;
     String nombre;
     Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese la cedula del estudiante :");
        cedula = reader.nextInt();
        System.out.println("Ingrese el nombre del estudiante :");
        nombre = reader.next();
        System.out.println("Ingrese el promedio del estudiante :");
        promedio = reader.nextInt();
    }
    

}
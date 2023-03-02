import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*  Universidad universidad = new Universidad();
        Universidad universidad2 = new Universidad();

       universidad.aggEstudiante("Jorge",26,1);
       universidad2.aggEstudiante("Claudia",30,2);

        universidad.mostrarEstudiantes();*/


    //Universidad universidad1 = new Universidad();
    //universidad1.aggEstudiante();
    //universidad1.mostrarEstudiantes();

         Scanner in = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = in.nextInt();

            switch (opcion){
                case 1:
                   Universidad.aggEstudiante();
                break;

                case 2:
                    Universidad.mostrarEstudiantes();
                    break;

                case 3:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }


        }
        while (opcion != 3);

    }

    }

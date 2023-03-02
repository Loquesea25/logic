import javax.swing.*;
import java.util.Scanner;

public class Universidad {

    static Estudiante[] estudiantes = new Estudiante[100];
    static Scanner in = new Scanner(System.in);




   public static Estudiante aggEstudiante(){
       System.out.println("Ingrese el nombre del estudiante");
       String nombre = in.nextLine();
       System.out.println("Ingrese la edad del estudiante");
       int edad = in.nextInt();
       System.out.println("Ingrese el codigo del estudiante");
       int codigo = in.nextInt();
     return new Estudiante();
    }

    public static void mostrarEstudiantes(){
        for(int i = 0; i < estudiantes.length; i ++){
            System.out.println("El nombre del estudiante en la posicion " + i + "es: " + estudiantes[i].getNombre()
            + " " + "La edad del estudiante en la posicion " + i + "es: " + estudiantes[i].getEdad()
                    + " " + "El codigo del estudiante en la posicion " + i + "es: " + estudiantes[i].getCodigo()
                    );
        }
    }
    }


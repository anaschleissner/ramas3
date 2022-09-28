import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!\n");
        Scanner lector = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String nombre = lector.nextLine();

        System.out.print("Dime tu año de nacimiento: ");
        int anio = lector.nextInt();

        int edad = 2022 - anio;

        System.out.println("Tu nombre es: " + nombre + " y tienes " + edad + " años");
    }
}

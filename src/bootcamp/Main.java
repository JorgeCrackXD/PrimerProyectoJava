package bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  //ATAJO PARA ESTA LÍNEA "PSVM"

        Scanner teclado = new Scanner(System.in); // DECLARACIÓN DEL TECLADO PARA LEER
        System.out.print("Escriba su nombre, por favorsito: ");
        String nombre = teclado.nextLine(); //Next se utiliza para imprimir Strings
        System.out.print("Escribe tu numero favorito:");
        int numero = teclado.nextInt();
        System.out.println("Hola, tu nombre es: " + nombre + "!!!");  //ATAJO PARA UN println es "sout"


    }
}

import java.util.Scanner;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Persona[] personas = new Persona[9];
        
        int cont = 0;

        while (cont < 9) {
            System.out.print("Ingrese el nombre --> ");
            String nombre = teclado.nextLine();

            int edad = -1;
            while (edad < 0) {
                System.out.print("Ingrese la edad --> ");
                edad = teclado.nextInt();
                teclado.nextLine();
                if (edad < 0) {
                    System.out.print("Edad incorrecta");
                }
            }

            personas[cont] = new Persona(nombre, edad);
            cont++;
        }

        // Ordenar el arreglo de productos por nombre
        BusquedaBinaria bBinaria = new BusquedaBinaria();

        System.out.print("\nIngrese la forma de buscar (1. Por nombre, 2. Por edad) --> ");
        int opcion = teclado.nextInt();
        teclado.nextLine();

        if (opcion == 1) {
            bBinaria.sortByName(personas);
            System.out.println("\nArreglo ordenado por nombre:");
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            System.out.print("\nIngrese el nombre a buscar --> ");
            String nombreBuscar = teclado.nextLine();

            System.out.println();
            int res = bBinaria.findByName(personas, nombreBuscar);

            if (res >= 0) {
                System.out.println("Entre en pos: " + res);
            } else {
                System.out.println("No se encontró");
            }

        } else {
            bBinaria.sortByAge(personas);
            System.out.println("\nArreglo ordenado por edad:");
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            System.out.print("\nIngrese la edad a buscar --> ");
            int edadBuscar = teclado.nextInt();
            teclado.nextLine();
            int res = bBinaria.findByAge(personas, edadBuscar);
            if (res >= 0) {
                System.out.println("Entre en pos: " + res);
            } else {
                System.out.println("No se encontró");
            }
        }
    }
}

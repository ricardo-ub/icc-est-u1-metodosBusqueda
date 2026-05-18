import java.util.Scanner;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Persona[] personas = new Persona[9];
        
        int cont = 0;

        while (cont < 9) {
            System.out.println("Ingrese el nombre -->");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese la edad -->");
            int edad = teclado.nextInt();
            personas[cont] = new Persona(nombre, edad);
            cont++;
        }

        // Ordenar el arreglo de productos por nombre
        BusquedaBinaria bBinaria = new BusquedaBinaria();
        bBinaria.sortByAge(personas);
        for (Persona persona : personas) {
            System.out.println(persona);
        }


        System.out.println("Ingrese la edad a buscar --> ");
        int edadBuscar = teclado.nextInt();
        int res = bBinaria.findByAge(personas, edadBuscar);

        if (res >= 0) {
            System.out.println("Entre en pos: " + res);
        } else {
            System.out.println("No se encontró");
        }
    }
}

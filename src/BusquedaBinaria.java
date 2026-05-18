import models.Persona;

public class BusquedaBinaria {

    public void sortByAge(Persona[] products) {
        // Ordenar el arreglo de productos por nombre utilizando el método de burbuja
        for (int i = 0; i < products.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].getEdad() > products[j + 1].getEdad()) {
                    // Intercambiar productos[j] y productos[j + 1]
                    Persona temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public int findByAge(Persona [] products, int edad) {
        //definamos el punto medio
        //comparemos con la clave
        //si es igual, retornamos el punto medio
        //si es mayor, actualizamos el index correspondiente
        //si es menor, actualizamos el index correspondiente

        int bajo = 0;
        int alto = products.length - 1;

        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
            if (products[central].getEdad() == edad) {
                return central; // Encontrado
            } 
            //si voy a la derecha o izquierda
            int comparacion = products[central].getEdad() - edad;
            if (comparacion < 0) {
                bajo = central + 1; // Buscar en la mitad superior
            } else {
                alto = central - 1; // Buscar en la mitad inferior
            }
        }   
    
        return -1; // No encontrado
    }
}
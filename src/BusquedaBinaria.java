import models.Product;

public class BusquedaBinaria {

    public void sortByName(Product[] products) {
        // Ordenar el arreglo de productos por nombre utilizando el método de burbuja
        for (int i = 0; i < products.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].getName().compareTo(products[j + 1].getName()) > 0) {
                    // Intercambiar productos[j] y productos[j + 1]
                    Product temp = products[j];
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

    public int findByName(Product [] products, String nombre) {
        //definamos el punto medio
        //comparemos con la clave
        //si es igual, retornamos el punto medio
        //si es mayor, actualizamos el index correspondiente
        //si es menor, actualizamos el index correspondiente

        int bajo = 0;
        int alto = products.length - 1;

        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
            if (products[central].getName().equals(nombre)) {
                return central; // Encontrado
            } 
            //si voy a la derecha o izquierda
            int comparacion = products[central].getName().compareTo(nombre);
            if (comparacion < 0) {
                bajo = central + 1; // Buscar en la mitad superior
            } else {
                alto = central - 1; // Buscar en la mitad inferior
            }
        }   
    
        return -1; // No encontrado
    }
}
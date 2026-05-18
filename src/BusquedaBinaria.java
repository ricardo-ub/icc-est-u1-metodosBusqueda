import models.Product;

public class BusquedaBinaria {

    public int findByName(Product [] products, String name) {
        //definamos el punto medio
        //comparemos con la clave
        //si es igual, retornamos el punto medio
        //si es mayor, actualizamos el index correspondiente
        //si es menor, actualizamos el index correspondiente
        int bajo = 0;
        int alto = products.length - 1;

        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
            if (products[central].getName().equals(name)) {
                return central; // Encontrado
            } else if (products[central].getName().compareTo(name) < 0) {
                bajo = central + 1; // Buscar en la mitad superior
            } else {
                alto = central - 1; // Buscar en la mitad inferior
            }
        }   
    }
}
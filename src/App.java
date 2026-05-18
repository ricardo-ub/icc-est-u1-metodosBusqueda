import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Product[] products = {
            new Product("Laptop", 20),
            new Product("Smartphone", 25),
            new Product("Tablet", 10),
            new Product("Monitor", 5),
            new Product("Keyboard",15)
        };
        // Ordenar el arreglo de productos por nombre
        BusquedaBinaria bBinaria = new BusquedaBinaria();
        bBinaria.sortByName(products);
        for (Product product : products) {
            System.out.println(product);
        }
        int res = bBinaria.findByName(products, "Laptop");
        if (res >= 0) {
            System.out.println("Entre en pos: " + res);
        } else {
            System.out.println("No se encontró");
        }
    }
}

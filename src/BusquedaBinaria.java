import models.Persona;

public class BusquedaBinaria {

    public void sortByAge(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public void sortByName(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getNombre().compareTo(personas[j + 1].getNombre()) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public int findByAge(Persona [] personas, int edad) {
        //definamos el punto medio
        //comparemos con la clave
        //si es igual, retornamos el punto medio
        //si es mayor, actualizamos el index correspondiente
        //si es menor, actualizamos el index correspondiente

        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int central = (bajo + alto) / 2;

            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].getEdad());
                if (i<alto) {
                    System.out.print(" | ");
                }
            }
            System.out.print("\n");

            System.out.print("bajo="+bajo+" alto="+alto+" central="+central+" valorCentro="+personas[central].getEdad()+ " --> ");
            
            if (personas[central].getEdad() == edad) {
                System.out.println("ENCONTRADO");
                return central;
            } 
            //si voy a la derecha o izquierda
            int comparacion = personas[central].getEdad() - edad;
            if (comparacion < 0) {
                System.out.println("DERECHA");
                bajo = central + 1;
            } else {
                System.out.println("IZQUIERDA");
                alto = central - 1;
            }
        }   
    
        return -1; // Para no encontrado
    }

    public int findByName(Persona [] personas, String nombre) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int central = (bajo + alto) / 2;

            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].getNombre());
                if (i<alto) {
                    System.out.print(" | ");
                }
            }
            System.out.print("\n");

            System.out.print("bajo="+bajo+" alto="+alto+" central="+central+" valorCentro="+personas[central].getNombre()+ " --> ");

            if (personas[central].getNombre().equals(nombre)) {
                System.out.println("ENCONTRADO");
                return central; // Encontrado
            } 
            //si voy a la derecha o izquierda
            int comparacion = personas[central].getNombre().compareTo(nombre);
            if (comparacion < 0) {
                System.out.println("DERECHA");
                bajo = central + 1;
            } else {
                System.out.println("IZQUIERDA");
                alto = central - 1;
            }
        }   
    
        return -1;
    }

    

}
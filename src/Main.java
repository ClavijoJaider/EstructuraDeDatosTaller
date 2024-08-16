

public class Main {
    public static void main(String[] args)
    {
        // Operaciones Básicas con Listas

        // 1. Creación de una lista para almacenar nombres

        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Mary";
        names[2] = "Charles";
        names[3] = "Lucy";
        names[4] = "Peter";

        printNames(names);
        searchName(names, "Mary");

    }

    public static void printNames(String[] names)
    {
        for (String name : names) {
            if (name != null) {  // Solo imprimir si el nombre no es null
                System.out.println(name);
            }
        }
    }

    public static void searchName(String[] names, String nameToSearch) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (nameToSearch.equals(names[i])) {
                System.out.println("Encontrado: " + nameToSearch);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No encontrado: " + nameToSearch);
        }
    }



}




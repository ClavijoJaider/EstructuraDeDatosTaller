package Clase1;

import java.util.Scanner;

public class Listas {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] names = new String[5];
    private static int nameCount = 0;

    public static void main(String[] args) {
        // Inicializar la lista de nombres
        names[0] = "John";
        names[1] = "Mary";
        names[2] = "Charles";
        names[3] = "Lucy";
        names[4] = "Peter";
        nameCount = 5;

        // Crear un objeto para manejar las tareas
        TaskManager taskManager = new TaskManager();

        // Menú principal
        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Mostrar nombres");
            System.out.println("2. Buscar nombre");
            System.out.println("3. Agregar nombre");
            System.out.println("4. Eliminar nombre");
            System.out.println("5. Agregar tarea");
            System.out.println("6. Eliminar tarea");
            System.out.println("7. Mostrar tareas");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (choice) {
                case 1:
                    printNames();
                    break;
                case 2:
                    System.out.print("Introduce el nombre a buscar: ");
                    String nameToSearch = scanner.nextLine();
                    searchName(nameToSearch);
                    break;
                case 3:
                    System.out.print("Introduce el nombre a agregar: ");
                    String newName = scanner.nextLine();
                    addName(newName);
                    break;
                case 4:
                    System.out.print("Introduce el nombre a eliminar: ");
                    String nameToRemove = scanner.nextLine();
                    removeName(nameToRemove);
                    break;
                case 5:
                    System.out.print("Introduce la tarea a agregar: ");
                    String newTask = scanner.nextLine();
                    taskManager.addTask(newTask);
                    break;
                case 6:
                    System.out.print("Introduce la tarea a eliminar: ");
                    String taskToRemove = scanner.nextLine();
                    taskManager.removeTask(taskToRemove);
                    break;
                case 7:
                    taskManager.showTasks();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    // Mostrar todos los nombres en la lista
    public static void printNames() {
        System.out.println("Nombres en la lista:");
        for (int i = 0; i < nameCount; i++) {
            System.out.println(names[i]);
        }
    }

    // Buscar un nombre en la lista
    public static void searchName(String nameToSearch) {
        boolean found = false;
        for (int i = 0; i < nameCount; i++) {
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

    // Agregar un nombre a la lista
    public static void addName(String newName) {
        if (nameCount < names.length) {
            for (int i = 0; i < nameCount; i++) {
                if (names[i].equals(newName)) {
                    System.out.println("El nombre " + newName + " ya está en la lista.");
                    return;
                }
            }
            names[nameCount] = newName;
            nameCount++;
            System.out.println("Nombre añadido: " + newName);
        } else {
            System.out.println("No hay espacio para añadir: " + newName);
        }
    }

    // Eliminar un nombre de la lista
    public static void removeName(String nameToRemove) {
        for (int i = 0; i < nameCount; i++) {
            if (nameToRemove.equals(names[i])) {
                for (int j = i; j < nameCount - 1; j++) {
                    names[j] = names[j + 1];
                }
                names[nameCount - 1] = null;
                nameCount--;
                System.out.println("Nombre eliminado: " + nameToRemove);
                return;
            }
        }
        System.out.println("Nombre no encontrado: " + nameToRemove);
    }
}
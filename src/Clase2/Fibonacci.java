package Clase2;

public class Fibonacci {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); // Captura el tiempo de inicio

        metodoFibo(); // Ejemplo de llamada con 10 números

        long fin = System.currentTimeMillis(); // Captura el tiempo al final
        long tiempoTotal = fin - inicio; // Calcula el tiempo total

        System.out.println("El tiempo de ejecución en milisegundos es: " + tiempoTotal + " ms");
    }

    public static void metodoFibo() {
        int numero1 = 0;
        int numero2 = 1;
        int suma = 0;
        for(int i = 0; i < 10; i++) {
            suma = numero1 + numero2;
            System.out.println("Serie Fibonacci: " + "i = "  + i + " | " + numero1 + " + " + numero2 + " = " + suma);
            numero1 = numero2;
            numero2 = suma;
        }
    }
}

package lad.com.alura.conversormoneda;

import java.io.IOException;
import java.util.Scanner;

public class Conversor {
    private static Scanner scanner = new Scanner(System.in);

    public static void eleccionUserMenu() throws IOException, InterruptedException {
        boolean continuar = true;

        System.out.println("*************************************************");
        System.out.println("Bienvenido/a al Conversor de Monedas =)");
        System.out.println("*************************************************");

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda("USD", "PEN", "Dólar estadounidense", "Sol peruano");
                    break;
                case 2:
                    convertirMoneda("PEN", "USD", "Sol peruano", "Dólar estadounidense");
                    break;
                case 3:
                    convertirMoneda("USD", "ARS", "Dólar estadounidense", "Peso argentino");
                    break;
                case 4:
                    convertirMoneda("ARS", "USD", "Peso argentino", "Dólar estadounidense");
                    break;
                case 5:
                    convertirMoneda("USD", "BRL", "Dólar estadounidense", "Real brasileño");
                    break;
                case 6:
                    convertirMoneda("BRL", "USD", "Real brasileño", "Dólar estadounidense");
                    break;
                case 7:
                    convertirMoneda("PEN", "ARS", "Sol peruano", "Peso argentino");
                    break;
                case 8:
                    convertirMoneda("PEN", "BRL", "Sol peruano", "Real brasileño");
                    break;
                case 9:
                    convertirMoneda("EUR", "PEN", "Euro", "Sol peruano");
                    break;
                case 10:
                    convertirMoneda("PEN", "EUR", "Sol peruano", "Euro");
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el Conversor de Monedas! ¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n1) Dólar =>> Sol peruano");
        System.out.println("2) Sol peruano =>> Dólar");
        System.out.println("3) Dólar =>> Peso argentino");
        System.out.println("4) Peso argentino =>> Dólar");
        System.out.println("5) Dólar =>> Real brasileño");
        System.out.println("6) Real brasileño =>> Dólar");
        System.out.println("7) Sol peruano =>> Peso argentino");
        System.out.println("8) Sol peruano =>> Real brasileño");
        System.out.println("9) Euro =>> Sol peruano");
        System.out.println("10) Sol peruano =>> Euro");
        System.out.println("0) Salir");
        System.out.print("Elija una opción válida: ");
    }

    private static void convertirMoneda(String monedaOrigen, String monedaDestino,
                                        String nombreOrigen, String nombreDestino)
            throws IOException, InterruptedException {
        System.out.print("Ingrese el valor que deseas convertir: ");
        double valor = scanner.nextDouble();

        try {
            double tasa = App.obtenerTasa(monedaOrigen, monedaDestino);
            double resultado = valor * tasa;

            System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]%n",
                    valor, nombreOrigen, resultado, nombreDestino);

            System.out.printf("Tasa de cambio actual: 1 %s = %.4f %s%n",
                    monedaOrigen, tasa, monedaDestino);

        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
            System.out.println("Verifique su conexión a internet y que su API key sea válida.");
        }
    }
}
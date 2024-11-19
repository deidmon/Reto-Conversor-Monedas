import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        System.out.println("*************************************");
        System.out.println("BIENVENIDO AL CONVERTIDOR DE MONEDAS:");
        System.out.println("*************************************\n");
        String menu = """
                **** Escribe el número de la operación deseada ****
                1 - Convertir Dólar --> Peso Argentino
                2 - Convertir Peso Argentino --> Dólar
                3 - Convertir Dólar --> Real Brasileño
                4 - Convertir Real Brasileño --> Dólar
                5 - Convertir Dólar --> Sol Peruano
                6 - Convertir Sol Peruano --> Dólar
                7 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            if (opcion == 7) {
                System.out.println("¡Gracias por usar el convertidor de monedas!");
                break;
            }

            // Declarar las monedas fuera del switch
            MonedasUsuales monedaBase = null;
            MonedasUsuales monedaDestino = null;

            switch (opcion) {
                case 1:
                    monedaBase = MonedasUsuales.USD;
                    monedaDestino = MonedasUsuales.ARS;
                    break;
                case 2:
                    monedaBase = MonedasUsuales.ARS;
                    monedaDestino = MonedasUsuales.USD;
                    break;
                case 3:
                    monedaBase = MonedasUsuales.USD;
                    monedaDestino = MonedasUsuales.BRL;
                    break;
                case 4:
                    monedaBase = MonedasUsuales.BRL;
                    monedaDestino = MonedasUsuales.USD;
                    break;
                case 5:
                    monedaBase = MonedasUsuales.USD;
                    monedaDestino = MonedasUsuales.PEN;
                    break;
                case 6:
                    monedaBase = MonedasUsuales.PEN;
                    monedaDestino = MonedasUsuales.USD;
                    break;
                default:
                    System.out.println("Opción no válida");
                    continue; // Volver a mostrar el menú
            }

            Scanner lectura = new Scanner(System.in);
            System.out.println("Escriba el monto que quiera convertir: ");
            try {
                var montoInicial = Double.parseDouble(lectura.nextLine());
                ConsultaMoneda consulta = new ConsultaMoneda();
                double montoConvertido = consulta.convertirMoneda(monedaBase, monedaDestino, montoInicial);
                System.out.println("El monto convertido en " +monedaBase.getCode() + " es: " + montoConvertido + "\n");
            } catch (Exception e) {
                System.out.println("Error al convertir moneda. Intente nuevamente.\n");
            }
        }
    }
}

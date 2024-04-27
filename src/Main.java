import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException {
        boolean continuar = true;
        int opcion = 0;
        HashMap <String, String> monedas = new HashMap<String, String>();
        monedas.put("Dolar", "USD");
        monedas.put("Argentina", "ARS");
        monedas.put("Argentina", "ARS");
        monedas.put("Brasil", "BRL");
        monedas.put("Colombia", "COP");
Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
       Cliente cliente = new Cliente();
        Conversion conversion = new Conversion();
        while (continuar) {
            System.out.println("-------------------------------------------------");
            System.out.println("Bienvenido al Conversor de Monedas");
            System.out.println("");
            System.out.println("");
            System.out.println("1- Dólar a Peso Argentino");
            System.out.println("2- Peso Argentino a Dólar");
            System.out.println("3- Dólar a Real Brasileño");
            System.out.println("4- Real Brasileño a Dólar");
            System.out.println("5- Dólar a Peso Colombiano");
            System.out.println("6- Peso Colombiano a Dólar");
            System.out.println("7- Salir");
            System.out.println("-------------------------------------------------");
            System.out.println("Elija una opción válida:");
            try{
                entrada = br.readLine();
                opcion= Integer.parseInt(entrada);
            }
            catch (Exception e)
            {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    conversion.monedaOrigen = monedas.get("Dolar");
                    conversion.monedaDestino = monedas.get("Argentina");
                    break;
                case 2:
                    conversion.monedaOrigen = monedas.get("Argentina");
                    conversion.monedaDestino = monedas.get("Dolar");

                    break;
                case 3:
                    conversion.monedaOrigen = monedas.get("Dolar");
                    conversion.monedaDestino = monedas.get("Brasil");
                    break;
                case 4:
                    conversion.monedaOrigen = monedas.get("Brasil");
                    conversion.monedaDestino = monedas.get("Dolar");
                    break;
                case 5:
                    conversion.monedaOrigen = monedas.get("Dolar");
                    conversion.monedaDestino = monedas.get("Colombia");
                    break;
                case 6:
                    conversion.monedaOrigen = monedas.get("Colombia");
                    conversion.monedaDestino = monedas.get("Dolar");
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            if (continuar){
                System.out.println("Ingrese la cantidad a convertir:");
                try{
                    entrada = br.readLine();
                    conversion.cantidad = Double.parseDouble(entrada);
                    cliente.ObtenerValorConversion(conversion);
                }
                catch (Exception e)
                {
                    conversion.cantidad = 0;
                }
                System.out.println("Presiona Enter para continuar...");
                System.in.read();
            }

        }
    }
}
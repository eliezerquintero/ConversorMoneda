import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        boolean continuar = true;
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        while (continuar) {
            System.out.println("-------------------------------------------------");
            System.out.println("Bienvenido al Conversor de Monedas");
            System.out.println("");
            System.out.println("");
            System.out.println("1- Dólar a Peso Argentino");
            System.out.println("2- Peso Argentino a Dólar");
            System.out.println("3- Dólar a Real Brasileño");
            System.out.println("4- Rel Brasileño a Dólar");
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

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
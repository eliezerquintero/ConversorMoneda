import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Cliente {
    String Key = "2bf98380484325f525609007";
    URL urlAPI = null;

    public int ObtenerValorConversion(Conversion conversion){
        try{
            HttpClient clienteHTTP = HttpClient.newHttpClient();


            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/"+Key+"/pair/"+conversion.monedaOrigen+"/"+conversion.monedaDestino+"/"+conversion.cantidad))
                    .build();


            clienteHTTP.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(System.out::println)
                    .join();
            clienteHTTP.close();
        }
        catch (Exception e)
        {
            return -1;
        }
return 0;
    }

}

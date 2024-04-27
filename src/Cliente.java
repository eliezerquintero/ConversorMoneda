import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class Cliente {
    String Key = "2bf98380484325f525609007";
    URL urlAPI = null;

    public int ObtenerValorConversion(Conversion conversion){
        try{
            HttpClient clienteHTTP = HttpClient.newHttpClient();


            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/"+Key+"/pair/"+conversion.monedaOrigen+"/"+conversion.monedaDestino+"/"+conversion.cantidad))
                    .build();


            CompletableFuture<String> responseBodyFuture = clienteHTTP.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body);
            String responseBody = responseBodyFuture.join();
            clienteHTTP.close();
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);
            conversion.resultado = jsonObject.get("conversion_result").getAsDouble();
        }
        catch (Exception e)
        {
            return -1;
        }
return 0;
    }

}

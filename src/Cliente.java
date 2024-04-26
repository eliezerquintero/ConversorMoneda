import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonParser;
public class Cliente {
    String Key = "2bf98380484325f525609007";
    URL urlAPI = null;

    public int ObtenerValorConversion(String moneda){
        try{
            urlAPI = new URL("https://v6.exchangerate-api.com/v6/"+Key+"/latest/"+moneda);
            HttpURLConnection connection = (HttpURLConnection) urlAPI.openConnection();
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            String req_result = jsonobj.get("result").getAsString();
        }
        catch (Exception e)
        {
            return -1;
        }
return 0;
    }

}

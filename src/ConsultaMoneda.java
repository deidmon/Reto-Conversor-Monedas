import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public double convertirMoneda(MonedasUsuales monedaBase, MonedasUsuales monedaDestino, double cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/61f7d5b288efcd28f5cf29f9/pair/"+ monedaBase.getCode() + "/" + monedaDestino.getCode() + "/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            MonedaExch result = new Gson().fromJson(response.body(), MonedaExch.class);
            return  result.conversion_result();
        } catch (Exception e){
            throw new RuntimeException("No encontré esa moneda.");
        }
    }
}

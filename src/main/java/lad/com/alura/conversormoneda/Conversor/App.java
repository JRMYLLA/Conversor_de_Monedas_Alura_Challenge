package lad.com.alura.conversormoneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class App {
    private static final String API_KEY = "7657777f222f828eeb7cd36a";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public static void main(String[] args) throws IOException, InterruptedException {
        Conversor.eleccionUserMenu();
    }

    public static double obtenerTasa(String monedaOrigen, String monedaDestino) throws IOException, InterruptedException {
        String urlFinal = BASE_URL + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlFinal))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonElement elemento = JsonParser.parseString(response.body());
        JsonObject objectRoot = elemento.getAsJsonObject();

        String result = objectRoot.get("result").getAsString();
        if (!"success".equals(result)) {
            throw new RuntimeException("Error en la API: " + objectRoot.get("error-type").getAsString());
        }

        double tasa = objectRoot.get("conversion_rate").getAsDouble();
        return tasa;
    }
}
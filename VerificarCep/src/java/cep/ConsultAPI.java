package java.cep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultAPI {

    public String api (PutCep c) throws IOException, InterruptedException {
        try {
            String cep =  "https://"+ "viacep.com.br/ws/" + c.getCep() + "/json/";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.
                    newBuilder()
                    .uri(URI.create(cep))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String corpo = response.body();
            return corpo;
        } catch (IOException e ) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}


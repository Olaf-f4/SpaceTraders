import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        URL ST = new URL("https://api.spacetraders.io/v2/factions");
        HttpsURLConnection con = (HttpsURLConnection) ST.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream()));
        String inputLine;


        while ((inputLine = in.readLine()) != null) {
            System.out.println("Information: " + inputLine);
        }

        in.close();

        //Super Secret Key
        APIKey k = new APIKey();
        k.Key();

        Testing




        //TO JSON
        Translate translate = new Translate();
        translate.setSymbol("Cosmic");
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(translate);
        System.out.println(jsonRequest);

//        HttpRequest postRequest = HttpRequest.newBuilder()
//                .uri(new URI("https://api.spacetraders.io/v2/factions"))
//                .header("Authorization", Constants. )
//                .POST(HttpRequest.BodyPublisher);


        //From JSON
        //newInput = gson.fromJson(inputLine, Translate.class);
        //System.out.println(translate.getID());

    }
}

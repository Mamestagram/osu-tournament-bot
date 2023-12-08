package net.mameosu.Data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.mameosu.System.Logger.ConsoleMessage;
import net.mameosu.System.Logger.Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class JsonData {

    public JsonNode GetJsonNodeAsURL(String url) {

        StringBuilder response = null;
        JsonNode nodeData;
        ObjectMapper mapper = new ObjectMapper();;

        try {
            URL obj = new URL(url);

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            response = new StringBuilder();

            while((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            return mapper.readTree(response.toString());

        } catch (IOException e) {
            ConsoleMessage.PrintConsoleMessage("Jsonデータの取得時にエラーが発生しました!", Level.Error);
            return null;
        }
    }
}

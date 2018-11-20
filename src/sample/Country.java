package sample;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Country {

    public static List<String> readFromAPI(){

        String contents = "";
        try {
            URL address = new URL("https://api.openaq.org/v1/countries");
            InputStreamReader reader = new InputStreamReader(address.openStream());
            BufferedReader buffer = new BufferedReader(reader);

            String line = "";
            while((line = buffer.readLine())!= null){
                contents += line;
            }

            return parseCountries(contents);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static List<String> parseCountries(String contents){
        Gson parser = new Gson();
        JsonObject parsed = parser.fromJson(contents, JsonObject.class);
        JsonArray results = parsed.getAsJsonArray("results");

        ArrayList<String> result = new ArrayList<String>();
        for(JsonElement item:results){
            JsonObject country_item = item.getAsJsonObject();

            String name = country_item.getAsJsonPrimitive("name").getAsString();
            String code = country_item.getAsJsonPrimitive("code").getAsString();

            String obj = name + " (" +  code + ")";
            result.add(obj);
        }

        return result;
    }
}

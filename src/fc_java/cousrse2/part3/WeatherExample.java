package fc_java.cousrse2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey ="0316f720c02e71b525eb7a952033dba6";
        String city = "Seoul";
        String urlString ="너의 Api를 적어보렴";

        try{
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");

            int responseCode=connection.getResponseCode();
            if (responseCode == 200) {
                // 스트림(Stream=입력,출력)의 연결
                BufferedReader in =new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine=in.readLine())!=null) {
                    content.append(inputLine);
                }
                in.close();
                System.out.println("content.toString() = " + content.toString());
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();
                System.out.println("temp = " + temp);
                connection.disconnect();
                // temp = 9.66


            }else {
                // 오류 ~~~
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}

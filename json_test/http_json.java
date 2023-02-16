import org.json.*;
import java.net.*;
import java.io.*;
import java.util.*;
class http_json{
    public static void main(String[] argv){
        String new_data = get_data("http://127.0.0.1:8080");

        //JSONObject js  = new JSONObject(new_data);
        JSONArray js = new JSONArray(new_data);
        
        //String name = js.getString("name")[0];
        int a = js.length();
        System.out.println(js.getJSONObject(1));
        System.out.println(a);
        
    }

    //get request to server
    public static String get_data(String urla){
        try{
        URL url = new URL(urla);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String line;

        StringBuilder content = new StringBuilder();

        while((line = in.readLine()) != null){
            content.append(line);
        }
        in.close();
        return content.toString();
    }catch(IOException e){
        return "error";
    }
    }
}
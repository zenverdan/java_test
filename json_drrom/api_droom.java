import org.json.*;
import java.net.*;
import java.io.*;

class api_droom{
    public static void main(String[] args){
        String data = send_req("HP19C5851");
        JSONObject js = new JSONObject(data);
        
        System.out.println(js.getJSONObject("data").getJSONObject("response").get("registration_number"));    
    }

    public static String send_req(String plate_no){
        try{
        String url_str = "https://apinew.droom.in/v6/vehicle/history?vehicle_reg_no="+plate_no;
        URL url = new URL(url_str);
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
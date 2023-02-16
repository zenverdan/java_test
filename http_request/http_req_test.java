import java.net.*;
import java.io.*;
class http_req_test{
    public static void main(String[] args){
        String get_data  = send("http://127.0.0.1:8080");
        System.out.println(get_data);

    }

    public static String send(String urla){
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
            e.printStackTrace();
            return "error";
        }

    }
}
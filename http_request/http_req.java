import java.net.*;
import java.io.*;
class http_req{
    public static void main(String[] args){
        try {
            // Set up the URL and create a HttpURLConnection object
            URL url = new URL("http://127.0.0.1:8080");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            con.setRequestMethod("GET");

            // Read the response from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
                System.out.println(inputLine);
            }

            // Close the input stream
            in.close();

            // Print the response
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
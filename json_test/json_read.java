import org.json.*;
class json_read{
    public static void main(String [] args){
        String jsonData = "{\"name\": \"John Smith\", \"age\": 30, \"city\": \"New York\"}";
        JSONObject jsonObject = new JSONObject(jsonData);

        // read values from the JSONObject
        String name = jsonObject.getString("name");
        System.out.println(name);
    }

    
}
package ex44;

import org.json.*;

public class Main {
    public static  void main(String[] args){
        String jsonString = "exercise44_input.json" ;
        JSONObject obj = new JSONObject(jsonString);

        JSONArray arr = obj.getJSONArray("products");

        for (int i = 0; i < arr.length(); i++) {
            String name = obj.getJSONObject(i).getString("name");
            String price = obj.getJSONObject(i).getString("price");
            String quantity = obj.getJSONObject(i).getString("quantity");
        }
    }
}

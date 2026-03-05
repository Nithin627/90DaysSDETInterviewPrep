package com.practise;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDataTest {
	public static void main(String[] args) {

		String jsonData = """
				{
				    "Items":[
				    {
				       "id" : "P001",
				       "name" : "Laptop",
				       "price": 999.9
				    },
				    {
				       "id" : "P002",
				       "name" : "Laptop",
				       "price": 999.9
				    }
				    ]

				}


				""";

		JSONObject jsO = new JSONObject(jsonData);
		JSONArray jArray = jsO.getJSONArray("Items");

		for (int i = 0; i < jArray.length(); i++) {
			JSONObject data = jArray.getJSONObject(i);

			if (data.getString("name").equalsIgnoreCase("Laptop")) {

				data.put("name", "Desktop");

			}

		}

		System.out.println(jsO.toString(2));

	}
}

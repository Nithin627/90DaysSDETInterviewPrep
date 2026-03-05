package com.epam;

import com.google.gson.Gson;

public class Runner {

	public static void main(String[] args) {

		User u1 = new User("Nithin", 25);
		System.out.println(u1);

//		Convert java object into json or xml -> is serialization

//		using Gson 
//		Serialization
		Gson gson = new Gson();
		String jsonS = gson.toJson(u1);
		System.out.println(jsonS);

//		De-serialization : convert json to java object
		String jsonData = """
				{"name":"Ram","age":45}
				""";
		User u2 = gson.fromJson(jsonData, User.class);
		System.out.println(u2);

//		Using jackson

	}

}

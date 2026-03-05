package com.epam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner2 {

	public static void main(String[] args) throws JsonProcessingException {

		User u1 = new User("Nithin", 25);
		System.out.println(u1);

//		Convert java object into json or xml -> is serialization

//		Using jackson
//		Serialization
		ObjectMapper mapper = new ObjectMapper();
		String value = mapper.writeValueAsString(u1);
		System.out.println(value);

		String prettyData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u1);
		System.out.println(prettyData);

//		De-serialization
		String jsonData = """
				{"name":"Ram","age":45}
				""";

		User u2 = mapper.readValue(jsonData, User.class);
		System.out.println(u2);

	}

}

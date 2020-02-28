package com.tomjay.gson;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.map2Json();
		
		main.object2Json();
		
		main.json2Object();

	}
	
	
	// Convert map to json
	private void map2Json() {
		
		
		Date now = new Date();
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		
		Map<String, Object> addressMap = new HashMap<String, Object>();
		
		addressMap.put("address1", "100 A Street");
		addressMap.put("address2", "Apt 22");
		addressMap.put("city", "San Francisco");
		addressMap.put("state", "CA");
		addressMap.put("zip", "94040");

		
		dataMap.put("id", "111-222-333");
		dataMap.put("name", "Tom");
		dataMap.put("age", 25);
		dataMap.put("directive", 325.66);
		dataMap.put("active", true);
		dataMap.put("address", addressMap);
		dataMap.put("timestamp", now.getTime());
		
		
		
		Gson gson = new Gson();
		
		String jsonStr = gson.toJson(dataMap);
		
		System.out.println("jsonStr=" + jsonStr);

		
		Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
		
		String prettyJsonStr = gsonPretty.toJson(dataMap);
		
		System.out.println("prettyJsonStr=" + prettyJsonStr);

		
		
	}
	
	// Convert Java object to json
	private void object2Json() {
		
		
		MyObject myObject = new MyObject();
				
		
		Gson gson = new Gson();
		
		String myObjectStr = gson.toJson(myObject);
		
		System.out.println("nothing set myObjectStr=" + myObjectStr);
		
		myObject.setId("112233");
		myObject.getItems().add("One");
		myObject.getItems().add("Two");
		myObject.setName("Tom");
		
		myObjectStr = gson.toJson(myObject);


		System.out.println("attributes set myObjectStr=" + myObjectStr);


		
		
	}
	
	// Convert Json to Java object
	private void json2Object() {
		
		
		Gson gson = new Gson();
		
		MyObject myObject = gson.fromJson("{\"myobjectId\":\"112233\",\"name\":\"Fred\",\"items\":[\"One\",\"Two\"]}\n", MyObject.class);
		
		
		String myObjectStr = gson.toJson(myObject);
		


		System.out.println("myObject.id=" + myObject.getId());
		System.out.println("myObject.name=" + myObject.getName());


		
		
	}



}

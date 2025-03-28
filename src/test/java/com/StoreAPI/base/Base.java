package com.StoreAPI.base;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base 
{
	private static final String BASE_URI="https://api.escuelajs.co";
	private static RequestSpecification requestSpecification;
	
	public Base()
	{
		requestSpecification=given()
				.baseUri(BASE_URI)
							.header("Content-Type","application/json");
	}
	
	public static Response POST(Object payload,String endpoint)
	{
		return requestSpecification.body(payload).when().post(endpoint);
	}
}	

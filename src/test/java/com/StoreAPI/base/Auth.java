package com.StoreAPI.base;

import io.restassured.response.Response;

public class Auth extends Base 
{
	private static String BASE_PATH="/api/v1/auth/";
	
	public static Response LoginAction(Object payload)
	{
		return POST(payload, BASE_PATH+"login");
	}
}

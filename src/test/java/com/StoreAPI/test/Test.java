package com.StoreAPI.test;

import static org.testng.Assert.assertNotNull;

import com.StoreAPI.base.Auth;
import com.StoreAPI.body.RequestPayload;
import com.StoreAPI.body.ResponseBody;

public class Test 
{
	@org.testng.annotations.Test
	public static void Login()
	{
		RequestPayload payload=new RequestPayload();
		payload.setEmail("john@mail.com");
		payload.setPassword("changeme");
		Auth auth=new Auth();
		ResponseBody response=auth.LoginAction(payload)
		.then()
		.assertThat()
		.header("Content-Type", "application/json; charset=utf-8")
		.header("Server", "Cowboy")
		.statusCode(201)
		.log()
		.all()
		.and()
		.extract()
		.as(ResponseBody.class);
		
		assertNotNull(response.getAccess_token());
	}
}

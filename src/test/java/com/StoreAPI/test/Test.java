package com.StoreAPI.test;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.DataProvider;
import com.StoreAPI.base.Auth;
import com.StoreAPI.body.RequestPayload;
import com.StoreAPI.body.ResponseBody;





public class Test 
{
	@org.testng.annotations.Test(dataProvider = "LoginTestData")
	public static void Login(String email,String password)
	{
		RequestPayload payload=new RequestPayload();
		payload.setEmail(email);
		payload.setPassword(password);
		Auth auth=new Auth();
		ResponseBody response=auth.LoginAction(payload)
		.then()
		.assertThat()
		.header("Content-Type", "application/json; charset=utf-8")
		.header("Server", "Cowboy")
		.header("Connection", "keep-alive")
		.statusCode(201)
		.log()
		.all()
		.and()
		.extract()
		.as(ResponseBody.class);
		System.out.println("=================>"+response.getAccess_token()+"<=============================");
		System.out.println("=================>"+response.getRefresh_token()+"<=============================");
		
		assertNotNull(response.getAccess_token());
		assertNotNull(response.getClass());
	}
	
	@DataProvider(name="LoginTestData")
	public static Object[][] TestData()
	{
		return new Object[][]
		{
			{"john@mail.com","changeme"},
		};
	}
}

package com.RestAssured;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicMethod {
//	@Test
	public static void postmethod() {
		RestAssured.baseURI="https://api.github.com";
		String bearertoken ="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ggfgf";
		
		Response response = RestAssured.given().headers("Authorization", "Bearer"+ bearertoken, "Content-type")
				.body("{r/n"+"\"name\":\"NEWREP81\"\r\n"+"}").when().post("/user/repos")
				.then().log().all().extract().response();
		System.out.println(response.asString());
		
		System.out.println(response.getStatusCode());
	}}
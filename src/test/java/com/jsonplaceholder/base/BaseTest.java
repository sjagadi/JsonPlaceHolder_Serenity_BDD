package com.jsonplaceholder.base;
import org.junit.BeforeClass;

import com.jsonplaceholder.utils.Utils;

import io.restassured.RestAssured;

public class BaseTest 
{
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = Utils.getConfigValue("BaseURI");
	}
}

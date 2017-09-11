package com.serviceTest;



import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ResponsePojo.RtbsapubResponsePojo;
import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import com.services.Services;

public class LoginTest {

	Logger logger=Logger.getLogger(LoginTest.class);

	/**
	 * rtbsapub api call for rt=2, json response
	 */
	
	@Test(invocationCount = 100)
	public void rtbsapubApiTest()
	{
		
		Services service=new Services();
		Response rtbsapubApiCall = service.rtbsapubApiCall("8PO65K493","782647924*1|728x90|8CU2553YN|news-desk","http://freeflys.com","2","2");
		Gson gson=new Gson();
		RtbsapubResponsePojo[] fromJson = gson.fromJson(rtbsapubApiCall.asString(),RtbsapubResponsePojo[].class);
		Assert.assertEquals(fromJson[0].getBidderId(), "1");
		logger.info("veified the bidder id in the response i.e "+fromJson[0].getBidderId());
		Assert.assertEquals(fromJson[0].getPrice(),  new BigDecimal("55555.001"));
		Assert.assertEquals(fromJson[0].getCur(), "USD");
		Assert.assertEquals(fromJson[0].getNoBid(), Boolean.FALSE);
		logger.info("veified the no bid status in the response i.e "+fromJson[0].getNoBid());
		Assert.assertEquals(fromJson[0].getCrid(), "782647924");
	}
	
	
	
}

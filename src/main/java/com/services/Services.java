package com.services;


import org.apache.log4j.Logger;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;


public class Services {

	Logger logger=Logger.getLogger(Services.class);
	
	/**
	 * for the rtbsapub api call will pass the below params
	 * @param cid -publisher id mandatory params
	 * @param requestString -mandatory params
	 * @param requrl-mandatory params
	 * @param at-1/2 , 2 for video
	 * @param rt -1,2,3,4 ,2 for json response
	 * @return
	 */
	public Response rtbsapubApiCall(String cid,String requestString,String requrl,String at,String rt)
	{
		RequestSpecification spec = RestAssured.given();
        spec.queryParam("cid", cid);
        spec.queryParam("requestString", requestString);
        spec.queryParam("requrl", requrl);
        spec.queryParam("at", at);
        spec.queryParam("rt", rt);
        Response response = spec.get(URL.rtbsapubUrl);
        logger.info("Request the rtbsapub api");
        logger.info("Api response is "+response.asString());
	    return response;
	}
	
	
	
}

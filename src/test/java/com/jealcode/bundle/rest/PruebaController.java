package com.jealcode.bundle.rest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jealcode.bundle.rest.model.Prueba;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaController {
	@Test
	public void postPrueba_simpleTest() throws ClientProtocolException, IOException{
		Prueba prueba = new Prueba("prueba", 2);
	
   StringEntity stringEntity = new StringEntity(prueba.toString(),
	                ContentType.APPLICATION_JSON);
	    HttpUriRequest httpUriRequest = new HttpPost("http://localhost:8080/api/prueba");
	   // httpUriRequest.setParams(new HTTPpsetParameter("value", prueba.toString());
	    HttpResponse httpResponse = HttpClientBuilder.create().build().execute(httpUriRequest);
	    assertThat(httpResponse.getStatusLine().getStatusCode(),equalTo(HttpStatus.SC_OK));
	}
	@Test
	public void getPrueba_simpleTest() throws ClientProtocolException, IOException{
	    HttpUriRequest httpUriRequest = new HttpGet( "http://localhost:8080/api/prueba");
	    HttpResponse httpResponse = HttpClientBuilder.create().build().execute(httpUriRequest);
	    assertThat(httpResponse.getStatusLine().getStatusCode(),equalTo(HttpStatus.SC_OK));
	}
}




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
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaController {
	@Test
	public void setPrueba_simpleTest() throws ClientProtocolException, IOException{
	    HttpUriRequest httpUriRequest = new HttpPost( "http://localhost:8080/api/prueba");
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




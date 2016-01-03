package com.example;

import java.net.URLDecoder;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;
import org.glassfish.jersey.server.JSONP;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

//	@Inject
//	private BookService service;

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getIt() {
		//Book book = service.createBook("My New Book");
		return Response.status(Status.OK).entity("Got it!").build();
	}

	@GET
	@JSONP
	@Path("config")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getConfig() {
		HttpClient httpClient = new StdHttpClient.Builder().build();
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
				
		CouchDbConnector db = dbInstance.createConnector("db-deployment-target-mgmt", false);
		ConfigData data = db.get(ConfigData.class, "gls-client");
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		ConfigData myData = mapper.convertValue(data, ConfigData.class);
		
		
		
//		System.out.println(URLDecoder(name, "UTF-8"));
//		data URLDecoder.decode(name, "UTF-8");
		
		// InputStream is = db.queryForStream(query);
		// ObjectMapper mapper = new ObjectMapper();
		// JsonNode json = mapper.readTree(is);

		return Response.status(Status.OK).entity(myData.getConfig().get(0).getServer()).build();
	}
}

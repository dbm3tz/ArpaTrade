package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/stock-quote")
public class StockQuoteApi {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String getQuote() {
		String response = "<?xml version='1.0'?>" +
				"<symbol>dd</symbol>";
		return response;
	}
}

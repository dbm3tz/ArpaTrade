package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/notification")
public class NotificationApi {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getNotificationInfo() {
		String response = "<?xml version='1.0'?>" +
				"<name>Brian</name>";
		return response;
	}
}

package org.richard.web.messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.richard.web.messenger.model.Profile;
import org.richard.web.messenger.service.ProfileService;


@Path("/profiles")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class ProfileResource {

	ProfileService profile_service = new ProfileService();
	
	@GET
	public List<Profile> getProfiles(){
	return profile_service.getAllProfiles();
}
	
}

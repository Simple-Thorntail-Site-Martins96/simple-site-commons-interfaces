package com.lucamartinelli.app.simplesite.commons.home;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lucamartinelli.app.simplesite.commons.home.vo.Roles;
import com.lucamartinelli.app.simplesite.commons.home.vo.ServiceVO;

@Path("/home")
public interface HomeServiceInterface {
	
	@GET
	@Path("/role")
	@PermitAll
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})
	public Roles getRoles();
	
	@GET
	@Path("/name")
	@PermitAll
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})
	public String getFullName();

	@GET
	@Path("/services")
	@PermitAll
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})
	public List<ServiceVO> getServices();
	
	
}

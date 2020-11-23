package com.lucamartinelli.app.simplesite.commons.home.vo;

import java.util.Arrays;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlRootElement
@ApiModel(value = "Roles", description = "The list of roles related to the logged user")
public class Roles {
	
	@XmlElement(name = "roles", required = false, nillable = false)
	@SerializedName("roles")
	@ApiModelProperty(name = "roles", required = false, example = "{\"dev\", \"test\"}",
			allowEmptyValue = true)
	private Set<String> roles;

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		if (this.roles == null) 
			return Arrays.toString(new String[0]);
		return Arrays.toString(roles.toArray(new String[0]));
	}
	
}

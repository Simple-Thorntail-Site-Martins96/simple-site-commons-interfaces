package com.lucamartinelli.app.simplesite.commons.home.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlRootElement
@ApiModel(value = "Service", description = "The single service accessible by users")
public class ServiceVO {
	
	@XmlElement(name = "name", required = false, nillable = false)
	@SerializedName("name")
	@ApiModelProperty(name = "name", allowEmptyValue = true,
			notes = "The service's name", example = "My Super Service")
	private String name;
	@XmlElement(name = "displayInfo", required = false, nillable = false)
	@SerializedName("displayInfo")
	@ApiModelProperty(name = "displayInfo", allowEmptyValue = true,
	notes = "The service's information", example = "This service can gain you the world controll")
	private String displayInfo;
	@XmlElement(name = "url", required = true, nillable = false)
	@SerializedName("url")
	@ApiModelProperty(name = "url", allowEmptyValue = false,
	notes = "The service's url", example = "http://world.controll.service/go-on")
	private String url;
	
	public ServiceVO() {
	}

	public ServiceVO(String name, String displayInfo, String url) {
		super();
		this.name = name;
		this.displayInfo = displayInfo;
		this.url = url;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayInfo() {
		return displayInfo;
	}
	public void setDisplayInfo(String displayInfo) {
		this.displayInfo = displayInfo;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}

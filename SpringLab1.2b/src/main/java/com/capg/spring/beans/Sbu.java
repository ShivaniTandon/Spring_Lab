package com.capg.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sbu")
@Scope("singleton")
public class Sbu {
	
	@Value("PES-BU")
	private String sbuId;
	
	@Value("Product Engineering Services")
	private String sbuName;
	
	@Value("Kiran Rao")
	private String sbuHead;
	
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "Sbu [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	}
	

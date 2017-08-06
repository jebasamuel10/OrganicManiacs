package com.organically4u.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SourceFrom {

	@Id
	private Long id_srcfrom;
	private String gender;
	private String nickname;
	private String company;
	private String contact_No;
	private String city;
	
	public SourceFrom(){
	}

	public Long getId_srcfrom() {
		return id_srcfrom;
	}

	public void setId_srcfrom(Long id_srcfrom) {
		this.id_srcfrom = id_srcfrom;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContact_No() {
		return contact_No;
	}

	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}

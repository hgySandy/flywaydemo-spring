package com.lance.flywaydemo.models;

import com.lance.flywaydemo.annotations.Column;
import com.lance.flywaydemo.annotations.PropertyName;
import com.lance.flywaydemo.annotations.TableName;
import com.lance.flywaydemo.annotations.TemplateConstructor;

@TableName(value = "contact")
public class Contact {
	@Column("id")
	private Integer id;
	@Column("name")
	private String name;
	@Column("phone_number")
	private String phoneNumber;
	@Column("email")
	private String email;	

	public Contact() {
	}

	@TemplateConstructor
	public Contact(@PropertyName("id") Integer id,
			@PropertyName("name") String name,
			@PropertyName("phoneNumber") String phoneNumber,
			@PropertyName("email") String email) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

package com.example.javawebtutor.form;

import org.apache.struts.action.ActionForm;

public class nextForm extends ActionForm {

	
	
	
	
	public nextForm() {
		this.address = null;
	}
	
	
	
	/**
	 * @param address
	 */
	public nextForm(String address) {
		super();
		this.address = address;
	}

	private String address;

	/**
	 * 
	 * 
	 * 
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}

package com.adp.pojo;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString(includeFieldNames=false)
@JacksonXmlRootElement
public class AddressBook implements Serializable{
	
	@JacksonXmlElementWrapper(localName = "Contact")
	public List<Contact> contactList;
	
	/*	
	@JacksonXmlElementWrapper(localName = "Contact")
	@Autowired
	public Contact contact;
	*/
	
	public AddressBook() {
		super();
	}

	
	public AddressBook(List<Contact> contact) {
		super();
		this.contactList = contact;
	}


	@Override
	public String toString() {
		return "AddressBook [Contact=" + this.contactList + "]";
	}

	public List<Contact> getContact() {
		return this.contactList;
	}


	public void setContact(List<Contact> contact) {
		this.contactList = contact;
	}

	
	public void addContact(Contact contact) {
		this.contactList.add(contact);
	}

	
}

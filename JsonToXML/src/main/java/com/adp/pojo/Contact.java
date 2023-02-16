package com.adp.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString(includeFieldNames=true)

public class Contact implements Serializable{
	

	@JacksonXmlProperty(localName = "CustomerID")
	public String customerID;
	@JacksonXmlProperty(localName = "CompanyName")
	public String companyName;
	@JacksonXmlProperty(localName = "ContactName")
	public String contactName;
	@JacksonXmlProperty(localName = "ContactTitle")
	public String contactTitle;
	@JacksonXmlProperty(localName = "Address")
	public String address;
	@JacksonXmlProperty(localName = "City")
	public String city;
	@JacksonXmlProperty(localName = "Email")
	public String email;
	@JacksonXmlProperty(localName = "Region")
	public String region;
	@JacksonXmlProperty(localName = "PostalCode")
	public String postalCode;
	@JacksonXmlProperty(localName = "Country")
	public String country;
	@JacksonXmlProperty(localName = "Phone")
	public String phone;
	@JacksonXmlProperty(localName = "Fax")
	public String fax;
	
	public Contact() {
		super();
	}
	
	public Contact(String customerID, String companyName, String contactName, String contactTitle, String address,
			String city, String email, String region, String postalCode, String country, String phone, String fax) {
		super();
		this.customerID = customerID;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactTitle = contactTitle;
		this.address = address;
		this.city = city;
		this.email = email;
		this.region = region;
		this.postalCode = postalCode;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
	}
/*
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
*/
	@Override
	public String toString() {
		return "Contact [customerID=" + customerID + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", contactTitle=" + contactTitle + ", address=" + address + ", city=" + city + ", email=" + email
				+ ", region=" + region + ", postalCode=" + postalCode + ", country=" + country + ", phone=" + phone
				+ ", fax=" + fax + "]";
	}
	
	
	
}

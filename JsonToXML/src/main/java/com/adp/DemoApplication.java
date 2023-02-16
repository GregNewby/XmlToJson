package com.adp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adp.pojo.AddressBook;
import com.adp.pojo.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		try {
			System.out.println("JSON:");
			XmlToJson("src/main/resources/ab.xml");
			System.out.println("XML:");
			JsonToXml("src/main/resources/abToJson.json");

			
			
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void XmlToJson(String filename) throws IOException {
		
		String data=	FileUtils.readFileToString(new File(filename), "UTF-8");
		XmlMapper xmlMapper = new XmlMapper();
		//JsonNode jnode = xmlMapper.readTree(data.getBytes());
		
		//CREATE THE LIST OF CONTACT OBJECTS
		List<Contact> ab = xmlMapper.reader().forType(new TypeReference<List<Contact>>() {}).readValue(data.getBytes());
		
		ObjectMapper mapr = new ObjectMapper();
		String jsonStr = mapr.writeValueAsString(ab);
		System.out.println(jsonStr);
		
		FileWriter fw = new FileWriter("src/main/resources/abToJson.json");
		fw.write(jsonStr);
		fw.close();
		
	}
	
	public static void JsonToXml(String filename) throws IOException {

		String data=	FileUtils.readFileToString(new File(filename), "UTF-8");
	    ObjectMapper jsonMapper = new JsonMapper();
	    
	    //CREATE LIST OF CONTACT OBJECTS
		List<Contact> ab = jsonMapper.reader().forType(new TypeReference<List<Contact>>() {}).readValue(data.getBytes());

	    XmlMapper xmlMapper = new XmlMapper();
	    String xmlStr = xmlMapper.writeValueAsString(ab);
	    System.out.println(xmlStr);
		

		FileWriter fw = new FileWriter("src/main/resources/ab2.xml");
		fw.write(xmlStr);
		fw.close();
		
	}

}

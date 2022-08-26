package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			//read JSON file and map it to POJO
			Student theStudent = mapper.readValue(
					new File("data/sample-full.json"), Student.class);
			//print fist name and last name
			System.out.println("the name is: " + theStudent.getFirstName() + " " + theStudent.getLastName());
			
			//print address
			Address tempAddress = theStudent.getAddress();
			System.out.println("The street is: " + tempAddress.getStreet());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

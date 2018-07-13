package org.javalongislandmeetup.july2018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class July2018Application {

	public static void main(String[] args) {
		SpringApplication.run(July2018Application.class, args);
	}


		@RequestMapping(value = "/getfiles", method = RequestMethod.GET)
		public String getS3Files() {
			System.out.println ("GetS3");
	    return "blah";
	  }
}

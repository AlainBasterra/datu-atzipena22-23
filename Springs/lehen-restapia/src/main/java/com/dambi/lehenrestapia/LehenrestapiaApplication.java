package com.dambi.lehenrestapia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class LehenrestapiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LehenrestapiaApplication.class, args);
	}
	@GetMapping("/")
	public String home() {
		return "Gure lehen rest apia martxan dago."; 
	}
	
	@GetMapping("/kaixo")
	public String hello(@RequestParam(value = "izena", defaultValue = "mundua") String izena) {
		return String.format("Kaixo %s!", izena);
	}

	@GetMapping("/zenbatu")
	public String zenbatu(@RequestParam(value = "norarte", defaultValue = "5") String norarte) {

		String strEmaitza = "";
		for (int i = 1; i <= Integer.parseInt(norarte); i++) {
			if ((i%2) == 0){
				strEmaitza += ("<b>" + i + " </b><label style=\"color:blue; font-size: 40px;\">ඞ</label></br>");
			} else if ((i%3)== 0 ){
				strEmaitza += ("<b>" + i + " </b><label style=\"color:green; font-size: 40px;\">ඞ</label></br>");
			} else if ((i%5)== 0){
				strEmaitza += ("<b>" + i + " </b><label style=\"color:yellow; font-size: 40px;\">ඞ</label></br>");
			} else {
				strEmaitza += ("<b>" + i + " </b><label style=\"color:red; font-size: 40px;\">ඞ SUS</label></br>");
			}
			
		}
		return strEmaitza;
	}
}

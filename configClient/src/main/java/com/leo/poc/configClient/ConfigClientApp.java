package com.leo.poc.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientApp {
	
	public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class, args);
    }
	
	@Value("${arquivo}")
	private String param;
	
	@GetMapping("/config/{usuario}")
	public String getConfigByUser(@PathVariable("usuario") String usuario ) {
		return String.format("Olá! %s, arquivo atual: %s", usuario, param);
	}
	
}

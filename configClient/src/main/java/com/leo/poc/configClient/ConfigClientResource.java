package com.leo.poc.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientResource {
	
	@Value("${usuario.ambiente}")
	private String param;
	
	@GetMapping("/config/{usuario}")
	public String getConfigByUser(@PathVariable("usuario") String usuario ) {
		return String.format("Olá! %s, voce está no ambiente de %s", usuario, param);
	}
	

}
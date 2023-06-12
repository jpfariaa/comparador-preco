package com.comparador.mcp.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/componentes")
public class ComponenteController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/componente/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/componente/lista";
	}
}

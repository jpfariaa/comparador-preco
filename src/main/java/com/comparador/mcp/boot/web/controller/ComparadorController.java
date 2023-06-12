package com.comparador.mcp.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comparador")
public class ComparadorController {

	@GetMapping("/comparar")
	public String comparar() {
		return "/comparador/comparar";
	}
}

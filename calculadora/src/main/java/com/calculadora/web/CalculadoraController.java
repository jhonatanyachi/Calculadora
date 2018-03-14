package com.calculadora.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CalculadoraController {
	@GetMapping("/new")
	public String initCreationForm(Model model) {
		return "Calculadora";
	}
	
}

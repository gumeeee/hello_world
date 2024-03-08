package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

	@GetMapping("hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/bsms")
	public String bsm() {
		return "Habilidades: Trabalho em equipe, Orientação aos detalhes, Proatividade, Comunicação; \n Mentalidades: Persistência, Responsabilidade Pessoal, Orientação ao futuro, mentalidade de crescimento";
	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "Objetivo é concluir estudo de módulos da faculdade, compreender tudo sem duvidas sobre spring e melhorar meus métodos de estudos!";
	}
}

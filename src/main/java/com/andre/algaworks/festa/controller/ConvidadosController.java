package com.andre.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.andre.algaworks.festa.model.Convidado;
import com.andre.algaworks.festa.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	private Convidados convidados;
	private static final String LISTA_CONVIDADOS = "ListaConvidados";

	@GetMapping
	public ModelAndView list() {
		ModelAndView view = new ModelAndView(LISTA_CONVIDADOS);
		view.addObject("convidados", convidados.findAll());
		view.addObject(new Convidado());
		return view;
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
}

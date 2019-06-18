package br.jus.tjse.OlaMaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.jus.tjse.OlaMaven.model.Titulo;
import br.jus.tjse.OlaMaven.repository.TitulosRepository;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	// Marcação que serve para solicitar instância gerada automaticamente
	@Autowired
	private TitulosRepository titulos;
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";		
	}
	
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
		// Utilizando os métodos do do JPARepository da classe 'Titulos'		
		titulos.save(titulo);
		// Para enviar os dados (Model) e a View em um só objeto 
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Título salvo com sucesso!");
		return mv;
	}

}

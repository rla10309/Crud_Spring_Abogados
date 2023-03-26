package com.dawes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.AbogadoVO;
import com.dawes.servicio.ServicioAbogado;

@Controller
@RequestMapping("/abogado")
public class AbogadoControler {
	@Autowired
	private ServicioAbogado se;
	
	
	@RequestMapping("/listado")
	public String listar(Model modelo) {
		modelo.addAttribute("abogados", se.findAll());
		return "admin/abogado/listado";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("abogado", new AbogadoVO());
		return "admin/abogado/forminsertar";
	}
	@RequestMapping("/insertar")
	public String insertar(@ModelAttribute AbogadoVO abogado) {
		se.save(abogado);
		return "redirect:/abogado/listado";
	}
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam int idabogado) {
		se.delete(se.findById(idabogado).get());
		return "redirect:/abogado/listado";
	}
	@RequestMapping("/modificar")
	public String modificar(@RequestParam int idabogado, Model modelo) {
		modelo.addAttribute("abogado", se.findById(idabogado));
		return "admin/abogado/formmodificar";
		
	}

}

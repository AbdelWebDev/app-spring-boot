package org.opendevup.web;

import java.util.List;

import org.opendevup.dao.EtudiantRepository;
import org.opendevup.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/Etudiant")
public class etudiantController {
	@Autowired

	private EtudiantRepository etudiantRepository;

	@RequestMapping(value = "/Index")
	public String index(Model model) {
		List<Etudiant> etds= etudiantRepository.findAll();
		model.addAttribute("etudiants",etds);
		return "etudiants";
	}
}

package org.opendevup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.opendevup.dao.etudiantRepository;
import org.opendevup.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class AppSpringMvcApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(AppSpringMvcApplication.class, args);
		etudiantRepository etudiantRepository = ctx.getBean(etudiantRepository.class);
		DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("amri", dt.parse("1993-01-19"), "abdelouhabamri@hotmail.com",
				"/home/toshiba/photo/abdel.png"));
		etudiantRepository
				.save(new Etudiant("pierre", dt.parse("2000-01-19"), "piere@gmail.com", "/home/toshiba/photo/p.png"));

		Page<Etudiant> etds= etudiantRepository.findAll(new PageRequest(0, 5));
		etds.forEach(e -> System.out.println(e.getNom()));
	}
}

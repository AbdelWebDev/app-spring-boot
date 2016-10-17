package org.opendevup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.opendevup.dao.EtudiantRepository;
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
		EtudiantRepository etudiantRepository = ctx.getBean(EtudiantRepository.class);
		DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("amri", dt.parse("1993-01-19"), "abdelouhabamri@hotmail.com",
				"/home/toshiba/photo/abdel.png"));
		etudiantRepository
				.save(new Etudiant("pierre", dt.parse("2000-01-19"), "piere@gmail.com", "/home/toshiba/photo/p.png"));
		etudiantRepository.save(new Etudiant("amri", dt.parse("1993-01-19"), "abdelouhabamri@hotmail.com",
				"/home/toshiba/photo/abdel.png"));
		etudiantRepository
				.save(new Etudiant("jean", dt.parse("2000-01-19"), "jean@gmail.com", "/home/toshiba/photo/j.png"));
		etudiantRepository
				.save(new Etudiant("sam", dt.parse("1993-01-19"), "sam@hotmail.com", "/home/toshiba/photo/s.png"));
		etudiantRepository
				.save(new Etudiant("dave", dt.parse("2000-01-19"), "dave@gmail.com", "/home/toshiba/photo/d.png"));
		etudiantRepository
				.save(new Etudiant("dav", dt.parse("1993-01-19"), "dav@hotmail.com", "/home/toshiba/photo/abdel.png"));
		etudiantRepository.save(
				new Etudiant("clément", dt.parse("2000-01-19"), "clément@gmail.com", "/home/toshiba/photo/p.png"));
		etudiantRepository
				.save(new Etudiant("ibrih", dt.parse("1993-01-19"), "ibrih@hotmail.com", "/home/toshiba/photo/ib.png"));
		etudiantRepository
				.save(new Etudiant("laa", dt.parse("2000-01-19"), "lam@gmail.com", "/home/toshiba/photo/s.png"));
		etudiantRepository.save(new Etudiant("amra", dt.parse("1993-01-19"), "abdelouhabamri@hotmail.com",
				"/home/toshiba/photo/abdel.png"));
		etudiantRepository
				.save(new Etudiant("pierre", dt.parse("2000-01-19"), "piere@gmail.com", "/home/toshiba/photo/p.png"));
		etudiantRepository.save(new Etudiant("abdel", dt.parse("1993-01-19"), "abdelouhabamri@hotmail.com",
				"/home/toshiba/photo/abdel.png"));
		etudiantRepository
				.save(new Etudiant("jeans", dt.parse("2000-01-19"), "jean@gmail.com", "/home/toshiba/photo/j.png"));
		etudiantRepository
				.save(new Etudiant("sams", dt.parse("1993-01-19"), "sam@hotmail.com", "/home/toshiba/photo/s.png"));
		etudiantRepository
				.save(new Etudiant("davis", dt.parse("2000-01-19"), "dave@gmail.com", "/home/toshiba/photo/d.png"));
		etudiantRepository
				.save(new Etudiant("dadi", dt.parse("1993-01-19"), "dav@hotmail.com", "/home/toshiba/photo/abdel.png"));
		etudiantRepository.save(
				new Etudiant("yohan", dt.parse("2000-01-19"), "clément@gmail.com", "/home/toshiba/photo/p.png"));
		etudiantRepository
				.save(new Etudiant("patrice", dt.parse("1993-01-19"), "ibrih@hotmail.com", "/home/toshiba/photo/ib.png"));
		etudiantRepository
				.save(new Etudiant("florent", dt.parse("2000-01-19"), "lam@gmail.com", "/home/toshiba/photo/s.png"));


		Page<Etudiant> etds = etudiantRepository.findAll(new PageRequest(0, 10));
		etds.forEach(e -> System.out.println(e.getNom()));
	}
}

package es.kolbit.w04_webspring.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.kolbit.w04_webspring.model.Persona;
import es.kolbit.w04_webspring.services.Negocio;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	@Autowired
	private Negocio neg;

	public void add(Persona persona) {
		neg.add(persona);
	}

	@GetMapping
	public List<Persona> findAll() {
		return neg.findAll();
	}
	
	
}

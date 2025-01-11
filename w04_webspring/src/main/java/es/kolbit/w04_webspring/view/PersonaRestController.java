package es.kolbit.w04_webspring.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.kolbit.w04_webspring.dto.PersonaDto;
import es.kolbit.w04_webspring.dto.PersonaMapper;
import es.kolbit.w04_webspring.services.Negocio;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	@Autowired
	private Negocio neg;

	@PutMapping
	public void add(PersonaDto persona) {
		neg.add(PersonaMapper.getPersona(persona));
	}

	@GetMapping
	public List<PersonaDto> findAll() {
//		return neg.findAll().stream().map(p -> PersonaMapper.getPersonaDto(p)).toList();
		return neg.findAll().stream().map(p -> new PersonaDto(p.getId(), p.getNombre().toUpperCase(), p.getApellidos().toUpperCase())).toList();
	}
	
	
}

package es.kolbit.w04_webspring.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.kolbit.w04_webspring.model.Persona;

@Component
public class PersonaDaoImpl implements PersonaDao {

	private List<Persona> repo = new ArrayList<Persona>();
	
	public PersonaDaoImpl() {
		repo.add(new Persona("Charly", "García"));
	}
	
	@Override
	public void add(Persona persona) {
		repo.add(persona);
	}

	@Override
	public List<Persona> findAll() {
		return repo;
	}

}

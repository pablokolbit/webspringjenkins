package es.kolbit.w04_webspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.kolbit.w04_webspring.model.Persona;
import es.kolbit.w04_webspring.persistence.PersonaDao;

@Service
public class Negocio {

	@Autowired
	private PersonaDao daoP;

	public void add(Persona persona) {
		daoP.add(persona);
	}

	public List<Persona> findAll() {
		return daoP.findAll();
	}
	
}

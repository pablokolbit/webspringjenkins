package es.kolbit.w04_webspring.persistence;

import java.util.List;

import es.kolbit.w04_webspring.model.Persona;

public interface PersonaDao {

	void add(Persona persona);
	List<Persona> findAll();
}

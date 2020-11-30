package org.jk.service;

import java.util.List;
import java.util.Optional;

import org.jk.dao.PerRepository;
import org.jk.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerService {
	// Coding for happy path only assuming that the person record exists.
	@Autowired
	PerRepository repository;

	public List<Person> getPersonList() {
		List<Person> persons = repository.findAll();
		return persons;
	}

	public Person createPerson(Person p) {
		return repository.save(p);
	}

	public Person updateRecord(Person p) {
		return repository.save(p);
	}

	public Person getPersonById(Long id) {
		Optional<Person> p = repository.findById(id);
		return p.get();
	}

	public void deleteRecord(Long id) {
		repository.deleteById(id);
	}

}

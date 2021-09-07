package org.jk.controller;

import java.util.List;

import org.jk.entity.Person;
import org.jk.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/person")
public class WebController {

	@Autowired
	PerService personService;

	@PostMapping("/add")
	public Person addPerson(@RequestBody Person p) {
		Person person = personService.createPerson(p);
		return person;
	}

	@PutMapping("/edit")
	public String updatePerson(@RequestBody Person p) {
		personService.updateRecord(p);
		return "record updated successfully";
	}

	@DeleteMapping("/delete/{id}")
	public void deletePerson(@PathVariable("id") Long id) {
		personService.deleteRecord(id);
	}

	@GetMapping("/")
	public List<Person> getPersonList() {
		return personService.getPersonList();
	}

	@GetMapping("/{id}")
	public Person getPerson(@PathVariable("id") Long id) {
		return personService.getPersonById(id);
	}

}

package com.karem.fichiers.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karem.fichiers.entities.Type;
import com.karem.fichiers.repos.TypeRepository;

@RestController
@RequestMapping("/api/types")
@CrossOrigin
public class TypeRESTController {

	@Autowired TypeRepository typeRep;
	
	@RequestMapping( method = RequestMethod.GET)
	public List<Type> getAllTypes(){
		return typeRep.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Type createType(@RequestBody Type type) {
		return typeRep.save(type);
	}
}

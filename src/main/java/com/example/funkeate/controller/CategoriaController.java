package com.example.funkeate.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.funkeate.model.Categoria;
import com.example.funkeate.repository.CategoriaRepository;

@Controller
@RequestMapping(path="/categories")
public class CategoriaController {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewCategory (@RequestParam String name) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
				
	    Categoria c = new Categoria();
	    c.setNombre(name);
	    c.setEstado(true);
	    c.setCreated_at(new java.util.Date());
	    c.setUpdate_at(new java.util.Date());
	    categoriaRepository.save(c);
	    return "Saved";
	  }
	
	@GetMapping(path="/all")
	  public @ResponseBody Iterable<Categoria> getAllCategoria() {
	    // This returns a JSON or XML with the categories
	    return categoriaRepository.findAll();
	  }
	
	@GetMapping(path="/find") // Map ONLY POST Requests
	  public @ResponseBody Optional<Categoria>  findCategory (@RequestParam int categoria_id) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
				
		return categoriaRepository.findById(categoria_id);
	  }
}
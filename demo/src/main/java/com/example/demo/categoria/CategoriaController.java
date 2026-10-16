package com.example.demo.categoria;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categoria;
import com.example.demo.repo.CategoriaRepository;

@RestController
public class CategoriaController {
	private final CategoriaRepository repo;

	public CategoriaController(CategoriaRepository repo) {
		this.repo = repo;
	}

	@GetMapping("/categorias")
	public List<Categoria> findAllCategorias() {
		return repo.findAll();
	}

	@PostMapping("/categorias")
	public Categoria addCategoria(@RequestBody Categoria categoria) {
		return repo.save(categoria);
	}
}
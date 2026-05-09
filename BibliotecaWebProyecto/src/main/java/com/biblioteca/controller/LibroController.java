package com.biblioteca.controller;

import com.biblioteca.model.Libro;
import com.biblioteca.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Libro> listar() {
        return service.listar();
    }

    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return service.guardar(libro);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }

    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable int id,
                        @RequestBody Libro libro) {

    return service.actualizar(id, libro);
    }
}
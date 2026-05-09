package com.biblioteca.service;

import com.biblioteca.model.Libro;
import java.util.List;

public interface LibroService {

    List<Libro> listar();

    Libro guardar(Libro libro);

    void eliminar(int id);

    Libro actualizar(int id, Libro libro);
}
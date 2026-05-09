package com.biblioteca.dao;

import com.biblioteca.model.Libro;
import java.util.List;

public interface LibroDAO {

    List<Libro> listar();

    Libro guardar(Libro libro);

    void eliminar(int id);

    Libro actualizar(int id, Libro libro);
}
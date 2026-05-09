package com.biblioteca.service.impl;

import com.biblioteca.dao.LibroDAO;
import com.biblioteca.model.Libro;
import com.biblioteca.service.LibroService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    private final LibroDAO libroDAO;

    public LibroServiceImpl(LibroDAO libroDAO) {
        this.libroDAO = libroDAO;
    }

    @Override
    public List<Libro> listar() {
        return libroDAO.listar();
    }

    @Override
    public Libro guardar(Libro libro) {
        return libroDAO.guardar(libro);
    }

    @Override
    public void eliminar(int id) {
        libroDAO.eliminar(id);
    }

    @Override
    public Libro actualizar(int id, Libro libro) {
    return libroDAO.actualizar(id, libro);
    }
}
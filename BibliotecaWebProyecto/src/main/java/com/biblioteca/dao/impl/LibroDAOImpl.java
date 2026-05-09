package com.biblioteca.dao.impl;

import com.biblioteca.config.Conexion;
import com.biblioteca.dao.LibroDAO;
import com.biblioteca.model.Libro;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroDAOImpl implements LibroDAO {

    @Override
    public List<Libro> listar() {

        List<Libro> libros = new ArrayList<>();

        try {

            Connection con = Conexion.conectar();

            String sql = "SELECT * FROM libro";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Libro libro = new Libro();

                libro.setId(rs.getInt("id"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));

                libros.add(libro);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return libros;
    }

    @Override
    public Libro guardar(Libro libro) {

        try {

            Connection con = Conexion.conectar();

            String sql = "INSERT INTO libro(titulo, autor) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());

            ps.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return libro;
    }

    @Override
    public void eliminar(int id) {

        try {

            Connection con = Conexion.conectar();

            String sql = "DELETE FROM libro WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Libro actualizar(int id, Libro libro) {

        try {

            Connection con = Conexion.conectar();

            String sql = "UPDATE libro SET titulo=?, autor=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, id);

            ps.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return libro;
}
}
package com.estudiante_programacion.service;

import com.estudiante_programacion.model.Curso;
import com.estudiante_programacion.model.Tema;

import java.util.List;

public interface ITemaService {

    // métodos abstractos

    // métodos traer temas (LECTURA)
    public List<Tema> getTemas();

    // métodos para guardar un tema (ALTA)
    public void saveTema(Tema tem);


    public void deleteTema(Long id);


    public Tema findTema(Long id);

    public void editTema(Tema tema);


}

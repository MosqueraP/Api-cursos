package com.estudiante_programacion.service;

import com.estudiante_programacion.dto.CursoTemaDTO;
import com.estudiante_programacion.model.Curso;

import java.util.List;

//@Service
public interface ICursoService {
    // métodos abstractos

    // métodos traer personas (LECTURA)
    public List<Curso> getCursos();

    // métodos para guardar un curso (ALTA)
    public void saveCurso(Curso cur);

    // métodos para eliminar un curso (BAJA)
    public void deleteCurso(Long id_curso);

    // método buscar un solo objeto (LECTURA )
    public Curso findCurso(Long id_curso);

    // método modificar un curso ()
    public void editCurso(Curso cur); // llama al método en servicio

    public CursoTemaDTO temasPorCurso(Long id_curso);

    public List<Curso> getCursosJava();



}

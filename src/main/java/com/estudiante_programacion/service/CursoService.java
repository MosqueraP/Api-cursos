package com.estudiante_programacion.service;

import com.estudiante_programacion.dto.CursoTemaDTO;
import com.estudiante_programacion.model.Curso;
import com.estudiante_programacion.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public List<Curso> getCursos() {
        List<Curso> lisaCursos;
        lisaCursos = cursoRepo.findAll();
        return lisaCursos;
    }

    @Override
    public void saveCurso(Curso cur) {
        cursoRepo.save(cur);

    }

    @Override
    public void deleteCurso(Long id_curso) {
        cursoRepo.deleteById(id_curso);

    }

    @Override
    public Curso findCurso(Long id_curso) {
        return cursoRepo.findById(id_curso).orElse(null);
    }

    @Override
    public void editCurso(Curso cur) {
        this.saveCurso(cur); // guarda el objeto nuevo y modificado


    }

    @Override
    public CursoTemaDTO temasPorCurso(Long id_curso) {
        CursoTemaDTO curTemDTO = new CursoTemaDTO ();
        Curso curso = this.findCurso(id_curso);
        curTemDTO.setNombreCurso(curso.getNombre());
        curTemDTO.setListaTemas(curso.getListaTemas());

        return curTemDTO;

    }

    @Override
    public List<Curso> getCursosJava() {
        String palabra = "Java";
        String textoComparar;

        List<Curso> listaCursos = this.getCursos();
        List<Curso> listaCursosJava = new ArrayList<Curso>();

        for (Curso cur : listaCursos) {
            textoComparar = cur.getNombre();
            boolean contieneJava = textoComparar.contains(palabra);
            if (contieneJava == true) {
                listaCursosJava.add(cur);
            }
        }
        return listaCursosJava;
    }


}

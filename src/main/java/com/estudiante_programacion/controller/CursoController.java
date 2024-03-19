package com.estudiante_programacion.controller;

import com.estudiante_programacion.model.Curso;
import com.estudiante_programacion.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    // inyección de dependence de ICursoService
    @Autowired
    private ICursoService cursoServ;

    @GetMapping("/")
    public String holaMundo(){
        return "HOLA MUNDO!.";
    }

    // crear un nuevo curso
    @PostMapping("/cursos/create")
    public String saveCursos(@RequestBody Curso cur){
        cursoServ.saveCurso(cur);

        return "Curso guardado satisfactoriamente";
    }

    //obtener todos los cursos
    @GetMapping("/cursos/traer")
    public List<Curso> getCursos(){
        return cursoServ.getCursos();
    }


    //Obtener los temas de un determinado curso
    @DeleteMapping("/cursos/borrar/{id_curso}")
    public String deleteCurso(@PathVariable Long id_curso){
        cursoServ.deleteCurso(id_curso);
        return "Curso eliminado satisfactoriamente";
    }

    //Obtener todos los cursos que tengan como nombre la palabra "Java
    @GetMapping ("/cursos/java")
    public List<Curso> getCursosJava () {
        return cursoServ.getCursosJava();

    }

    // enpoint para modificar un curso otra
    //Modificar los datos de un curso
    @PutMapping("/cursos/editar")
    public Curso editCurso(@RequestBody Curso cur ){
        cursoServ.editCurso(cur);

        // devolver el objeto modificado traído desde ICursoService
        return cursoServ.findCurso(cur.getId_curso());
    }

}

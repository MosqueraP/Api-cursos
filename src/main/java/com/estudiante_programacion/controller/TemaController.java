package com.estudiante_programacion.controller;

import com.estudiante_programacion.model.Curso;
import com.estudiante_programacion.model.Tema;
import com.estudiante_programacion.service.ICursoService;
import com.estudiante_programacion.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    // inyección de dependence de ICursoService
    @Autowired
    private ITemaService temaServ;

    // crear un nuevo tema
    @PostMapping("/temas/create")
    public String saveCursos(@RequestBody Tema tem){
        temaServ.saveTema(tem);

        return "Tema guardado satisfactoriamente";
    }

    // traer todos los temas disponibles
    @GetMapping("/temas/traer")
    public List<Tema> getTemas(){
        return temaServ.getTemas();
    }


    // modificar los datos de un determinado tema
    @PutMapping("/temas/edit")
    public String editTema(@RequestBody Tema tema) {
        temaServ.editTema(tema);
        return "Tema editado correctamente";
    }

}

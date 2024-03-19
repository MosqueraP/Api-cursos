package com.estudiante_programacion.dto;

import com.estudiante_programacion.model.Tema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class CursoTemaDTO {

    private String nombreCurso;
    private List<Tema> listaTemas;
}

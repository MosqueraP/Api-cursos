package com.estudiante_programacion.service;

import com.estudiante_programacion.model.Tema;
import com.estudiante_programacion.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public List<Tema> getTemas() {
        List<Tema> lisaTemas;
        lisaTemas = temaRepo.findAll();
        return lisaTemas;
    }

    @Override
    public void saveTema(Tema tem) {
        temaRepo.save(tem);

    }

    @Override
    public void deleteTema(Long id) {
        temaRepo.deleteById(id);

    }

    @Override
    public Tema findTema(Long id) {
        return temaRepo.findById(id).orElse(null);
    }

    @Override
    public void editTema(Tema tema) {
        //acá se puede hacer también que edite parte por parte para que sea más detallado
        this.saveTema(tema);
    }
}

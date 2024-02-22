package com.cne.cargafood.domain.repository;

import com.cne.cargafood.domain.model.Cozinha;

import javax.transaction.Transactional;
import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> todas();
    Cozinha porId (Long id);
    Cozinha adicionar(Cozinha cozinha);
    void remover (Cozinha cozinha);

}

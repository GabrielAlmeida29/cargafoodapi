package com.cne.cargafood.domain.repository;

import com.cne.cargafood.domain.model.Cozinha;

import java.util.List;

public interface RestauranteRepository {

    List<Cozinha> todos();
    Cozinha porId (Long id);
    Cozinha adicionar(Cozinha cozinha);
    void remover (Cozinha cozinha);

}

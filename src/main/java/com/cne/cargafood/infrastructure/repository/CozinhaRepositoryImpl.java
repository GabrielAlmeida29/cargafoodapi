package com.cne.cargafood.infrastructure.repository;

import com.cne.cargafood.domain.model.Cozinha;
import com.cne.cargafood.domain.repository.CozinhaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> listar() {
        return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }

    @Override
    public Cozinha buscar(Long id) {
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha adicionar(Cozinha cozinha) {
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public Cozinha salvar (Cozinha cozinha) {
        return manager.merge(cozinha);
    }

    @Transactional
    @Override
    public void remover(Cozinha cozinha){
        cozinha = buscar(cozinha.getId());
        manager.remove(cozinha);
    }

}

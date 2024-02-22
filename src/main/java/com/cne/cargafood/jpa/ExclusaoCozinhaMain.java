package com.cne.cargafood.jpa;

import com.cne.cargafood.app.CargafoodApiApplication;
import com.cne.cargafood.domain.model.Cozinha;
import com.cne.cargafood.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ExclusaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(CargafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);

		cozinhas.remover(cozinha);

	}
	
}

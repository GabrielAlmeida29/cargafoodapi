package com.cne.cargafood.jpa;

import java.util.List;

import com.cne.cargafood.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.cne.cargafood.app.CargafoodApiApplication;
import com.cne.cargafood.domain.model.Cozinha;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(CargafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> todasCozinhas = cozinhas.todas();
		
		for(Cozinha cozinha : todasCozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
	
}

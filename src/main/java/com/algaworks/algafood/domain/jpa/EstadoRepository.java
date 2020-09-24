package com.algaworks.algafood.domain.jpa;

import java.util.List;

import com.algaworks.algafood.di.modelo.Cozinha;

public interface EstadoRepository {
	public List<Cozinha> lista();
}

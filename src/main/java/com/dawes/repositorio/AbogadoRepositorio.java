package com.dawes.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.AbogadoVO;

public interface AbogadoRepositorio extends CrudRepository<AbogadoVO, Integer> {
	public Optional<AbogadoVO> findByNombre(String nombre);

}

package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.AbogadoVO;

public interface ServicioAbogado {

	Optional<AbogadoVO> findByNombre(String nombre);

	<S extends AbogadoVO> S save(S entity);

	<S extends AbogadoVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<AbogadoVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<AbogadoVO> findAll();

	Iterable<AbogadoVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(AbogadoVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends AbogadoVO> entities);

	void deleteAll();

}
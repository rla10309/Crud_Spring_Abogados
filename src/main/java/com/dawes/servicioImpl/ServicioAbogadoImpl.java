package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.dawes.modelo.AbogadoVO;
import com.dawes.repositorio.AbogadoRepositorio;
import com.dawes.servicio.ServicioAbogado;

@Service
public class ServicioAbogadoImpl implements ServicioAbogado {
	@Autowired
	private AbogadoRepositorio er;

	@Override
	public Optional<AbogadoVO> findByNombre(String nombre) {
		return er.findByNombre(nombre);
	}

	@Override
	public <S extends AbogadoVO> S save(S entity) {
		try {
			er.save(entity);
		} catch (Exception e) {
			System.out.println("Error: " + e.getStackTrace());
		}
		return entity;
	}

	@Override
	public <S extends AbogadoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return er.saveAll(entities);
	}

	@Override
	public Optional<AbogadoVO> findById(Integer id) {
		return er.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return er.existsById(id);
	}

	@Override
	public Iterable<AbogadoVO> findAll() {
		return er.findAll();
	}

	@Override
	public Iterable<AbogadoVO> findAllById(Iterable<Integer> ids) {
		return er.findAllById(ids);
	}

	@Override
	public long count() {
		return er.count();
	}

	@Override
	public void deleteById(Integer id) {
		er.deleteById(id);
	}

	@Override
	public void delete(AbogadoVO entity) {
		er.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		er.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends AbogadoVO> entities) {
		er.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		er.deleteAll();
	}
	
	

}

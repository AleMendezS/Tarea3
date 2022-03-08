package com.tarea3.dao;


import com.tarea3.domain.Juego;
import org.springframework.data.repository.CrudRepository;


public interface JuegoDao extends CrudRepository<Juego, Long>{
    
}

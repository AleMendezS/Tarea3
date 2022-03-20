
package com.tarea3.service;

import com.tarea3.domain.Juego;
import java.util.List;

public interface JuegoService {
    public List<Juego> getJuego();
    
    public void save(Juego juego);
    
    public void delete(Juego juego);
    
    public Juego getJuego (Juego juego);
}

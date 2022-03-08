package com.tarea3.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="juego")

public class Juego implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idjuego;
    private String nombreJuego;
    private String categoria;
    private int cantidad;
   
    public Juego(){
    }
    
    public Juego(String nombreJuego, String categoria, int cantidad){
        this.nombreJuego=nombreJuego;
        this.categoria=categoria;
        this.cantidad=cantidad;
    }
}

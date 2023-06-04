package com.info.servicio.Jugador;

import java.util.List;

import com.info.domain.Equipo;
import com.info.domain.Jugador;

public interface JugadorService {
    
    Jugador crearJugador();
    void buscarJugador(List<Equipo> listaDeEquipos);
}

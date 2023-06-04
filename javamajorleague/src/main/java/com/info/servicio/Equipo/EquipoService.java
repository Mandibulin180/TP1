package com.info.servicio.Equipo;

import java.util.List;

import com.info.domain.Equipo;

public interface EquipoService {
    
    Equipo crearEquipo();
    void mostrarEquipo(List<Equipo> listaDeEquipos);
    void buscarEquipoMostrarJugadores(List<Equipo> listaDeEquipos);
    Equipo buscarEquipo(List<Equipo> listaDeEquipos);
    void eliminarEquipo(List<Equipo> listaDeEquipos);
}

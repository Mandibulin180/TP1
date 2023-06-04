package com.info.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private LocalDate fechaDeCreacion;
    private List<Jugador> jugadores = new ArrayList<>();
    private Entrenador entrenador;

    public Equipo(){}
    public Equipo(String nombre, LocalDate fechaDeCreacion, List<Jugador> jugadores, Entrenador entrenador){
        setNombre(nombre);
        setFechaDeCreacion(fechaDeCreacion);
        setEntrenador(entrenador);
        setJugadores(jugadores);
    }
    @Override
    public String toString() {
        String mostrar ="";
        mostrar =   "\nEQUIPO"+
                    "\nNOMBRE: "+nombre+
                    "\nFECHA DE CREACION: "+fechaDeCreacion+
                    "\nLISTA DE JUGADORES: [";
                    for(Jugador jugador: jugadores){
                        mostrar=mostrar+jugador.getNombre()+jugador.getApellido()+",";
                    }
                    mostrar+="]"+
                    "\nENTRENADOR: "+entrenador;

        return mostrar;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Entrenador getEntrenador() {
        return entrenador;
    }
    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public String getNombre() {
        return nombre;
    }
}

package com.info.bootstrap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.info.bootstrap.constantes.entrenadoresEquipos;
import com.info.domain.Equipo;
import com.info.domain.Jugador;

public class BootstrapData {
    public static Map<String,Equipo> equipos = new HashMap<>();

    public static void initEquipos(){
            equipos = new HashMap<>();
            cargarEquipos(equipos);
            System.out.println(equipos);
    }

    private static void cargarEquipos(Map<String,Equipo> equipos){
        List<Jugador> jugadores = new ArrayList<>();
        equipos.put("equipo1", new Equipo("chacarita", LocalDate.of(1999, 01, 12),jugadores, entrenadoresEquipos.entrenador1));
        equipos.put("equipo2", new Equipo("chasca", LocalDate.of(1990, 9, 21),jugadores, entrenadoresEquipos.entrenador2));
        equipos.put("equipo3", new Equipo("rain", LocalDate.of(1940, 06, 19),jugadores, entrenadoresEquipos.entrenador3));
    }
}


package com.info.bootstrap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.info.bootstrap.constantes.entrenadoresEquipos;
import com.info.domain.Equipo;
import com.info.domain.Jugador;

public class BootstrapData {
    public static Map<String,Equipo> equipos = new HashMap<>();
    private static List<Jugador> jugadores1;
    private static List<Jugador> jugadores2;
    private static List<Jugador> jugadores3;

    public static void initEquipos(){
            equipos = new HashMap<>();
            cargarEquipos(equipos);
    }

    private static void cargarEquipos(Map<String,Equipo> equipos){
        cargarJugadores();
        List<Jugador> jugadores = new ArrayList<>();
        equipos.put("chacarita", new Equipo("chacarita", LocalDate.of(1999, 01, 12),jugadores2, entrenadoresEquipos.entrenador1));
        //asigna a el equipo a los jugadores
        for(Jugador jugador: jugadores2){
            jugador.setEquipo(equipos.get("chacarita"));
        }
        equipos.put("prettier", new Equipo("prettier", LocalDate.of(1990, 9, 21),jugadores3, entrenadoresEquipos.entrenador2));
        //asigna a el equipo a los jugadores
        for(Jugador jugador: jugadores3){
            jugador.setEquipo(equipos.get("prettier"));
        }
        equipos.put("rain", new Equipo("rain", LocalDate.of(1940, 06, 19),jugadores1, entrenadoresEquipos.entrenador3));
        //asigna a el equipo a los jugadores
        for(Jugador jugador: jugadores1){
            jugador.setEquipo(equipos.get("rain"));
        }
        equipos.put("sun",new Equipo("sun", LocalDate.of(1968,05,28), jugadores, entrenadoresEquipos.entrenador4));
        equipos.put("moon",new Equipo("moon", LocalDate.of(1981,03,07), jugadores, entrenadoresEquipos.entrenador5));
    }

    private static void cargarJugadores(){
        //jugadores equipo rain
        Jugador jugador1 = new Jugador("juan", "hernan", 1.69F, "defensor", 19, 10, true, 99 ,null);
        Jugador jugador2 = new Jugador("alberto", "dos", 1.90F, "arquero", 0, 10, false, 90 ,null);
        Jugador jugador3 = new Jugador("luis", "castro", 1.78F, "defensor", 10, 10, false, 91 ,null );
        Jugador jugador4 = new Jugador("fabrian", "puentes", 1.59F, "mediocampista", 1, 10, false,92,null);
        Jugador jugador5 = new Jugador("alejo", "casa", 1.70F, "delantero", 20, 10, false, 93 ,null );
        jugadores1 = new ArrayList<>(Arrays.asList(jugador1,jugador2,jugador3,jugador4,jugador5));

        //jugadores equipo chacarita
        Jugador jugador6 = new Jugador("richard", "hernan", 1.69F, "defensor", 11, 10, true, 99 , null);
        Jugador jugador7 = new Jugador("lucas", "dos", 1.80F, "arquero", 0, 10, false, 90 , null);
        Jugador jugador8 = new Jugador("luciano", "castro", 1.58F, "defensor", 20, 10, false, 91 , null);
        Jugador jugador9 = new Jugador("bruno", "puentes", 1.69F, "mediocampista", 5, 10, false, 92 , null);
        Jugador jugador10 = new Jugador("felipe", "casa", 1.60F, "delantero", 17, 10, false, 93 , null);
        jugadores2 = new ArrayList<>(Arrays.asList(jugador6,jugador7,jugador8,jugador9,jugador10));
        //jugadores equipo 
        Jugador jugador11 = new Jugador("damian", "hernan", 1.79F, "defensor", 10, 10, true, 99 , null);
        Jugador jugador12 = new Jugador("lautaro", "dos", 1.90F, "arquero", 0, 10, false, 90 , null);
        Jugador jugador13 = new Jugador("lionel", "castro", 1.88F, "defensor", 11, 10, false, 91 , null);
        Jugador jugador14 = new Jugador("alvaro", "puentes", 1.69F, "mediocampista", 18, 10, false, 92 , null);
        Jugador jugador15 = new Jugador("emanuel", "casa", 1.80F, "delantero", 30, 10, false, 93 , null);
        jugadores3 = new ArrayList<>(Arrays.asList(jugador11,jugador12,jugador13,jugador14,jugador15));
    }
}


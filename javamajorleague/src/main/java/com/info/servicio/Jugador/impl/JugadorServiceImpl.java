package com.info.servicio.Jugador.impl;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import com.info.domain.Equipo;
import com.info.domain.Jugador;
import com.info.servicio.Jugador.JugadorService;
import com.info.servicio.entrada.console.inputService;

public class JugadorServiceImpl implements JugadorService {
    Scanner scanner=inputService.getScanner();
    //esto se debe borrar
    public static void main(String[] args) {
        JugadorService jugador = new JugadorServiceImpl();
        System.out.println(jugador.crearJugador().toString());
    }
    
    @Override
    public Jugador crearJugador() {
        Jugador jugador = new Jugador();
        jugador.setIdentificador(UUID.randomUUID());
        System.out.print("\nINGRESAR EL NOMBRE DEL JUGADOR: ");
        jugador.setNombre(scanner.nextLine().toLowerCase());
        System.out.print("INGRESAR APELLIDO DEL JUGADOR: ");
        jugador.setApellido(scanner.nextLine().toLowerCase());
        System.out.print("INGRESAR ALTURA DEL JUGADOR EN METROS: ");
        jugador.setAltura(scanner.nextFloat());
        // Esto evita un error
        inputService.getScanner().nextLine();
        // Verficia que la posicion ingresada sea correcta
        while(jugador.getPosicionQueJuega()==null){
            System.out.println("ARQUERO || DEFENSOR || MEDIOCAMPISTA || DELANTERO");
            System.out.print("INGRESAR EN QUE POSICION JUEGA: ");
            String posicion = scanner.nextLine().toLowerCase();
            if(posicion.equals("arquero")|| posicion.equals("defensor")||posicion.equals("mediocampista")||posicion.equals("delantero")){
                jugador.setPosicionQueJuega(posicion.toUpperCase());
            }else{
                System.out.println("LA POSICION INGRESADA NO ES CORRECTA VUELVA A INGRESARLA ");
            }
        }
        System.out.print("INGRESE LA CANTIDAD DE GOLES MARCADOS: ");
        jugador.setCantidadDeGoles(scanner.nextInt());
        System.out.print("INGRESE LA CANTIDAD DE PARTIDOS JUGADOS: ");
        jugador.setCantidadDePartidos(scanner.nextInt());
        System.out.print("INGRESE EL DORSAL DEL JUGADOR: ");
        jugador.setDorsal(scanner.nextInt());
        inputService.getScanner().nextLine(); 
        while (jugador.getEsCapitan()==null){
            System.out.print("EL JUGADOR ES CAPITAN? si/no ");
            String escapitan = scanner.nextLine().toLowerCase();
            if(escapitan.equals("si")){
                jugador.setEsCapitan(true);
            }else if(escapitan.equals("no")){
                jugador.setEsCapitan(false);
            } else{
                System.out.println("Solo responda si o no");
            }
        }
        return jugador;
    }
    @Override
    public void buscarJugador(List<Equipo> listaDeEquipos){
        System.out.print("INGRESE EL NOMBRE DEL JUGADOR: ");
        String nombreJugador = inputService.getScanner().nextLine().toLowerCase();
        for(Equipo equipoj: listaDeEquipos){
            for(Jugador Jugador: equipoj.getJugadores()){
                if(Jugador.getNombre().equals(nombreJugador)){
                    System.out.println("\nNOMBRE: "+Jugador.getNombre());
                    System.out.println("APELLIDO: "+Jugador.getApellido());
                    System.out.println("POSICION: "+Jugador.getPosicionQueJuega());
                    System.out.println("ES CAPITAN? "+Jugador.getEsCapitan());
                    System.out.println("NOMBRE DE SU EQEUIPO: "+Jugador.getEquipo().getNombre());
                    break;
                    
                }else {
                    System.out.println("\nEL JUGADOR INGRESADO NO EXISTE");
                    break;
                }
            }
        }

    }
}

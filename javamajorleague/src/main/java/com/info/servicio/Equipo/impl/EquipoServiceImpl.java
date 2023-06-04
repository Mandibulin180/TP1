package com.info.servicio.Equipo.impl;
import java.time.LocalDate;
import java.util.List;

import com.info.domain.Entrenador;
import com.info.domain.Equipo;
import com.info.domain.Jugador;
import com.info.servicio.Entrenador.EntrenadorService;
import com.info.servicio.Entrenador.impl.EntrenadorServiceImpl;
import com.info.servicio.Equipo.EquipoService;
import com.info.servicio.Jugador.JugadorService;
import com.info.servicio.Jugador.impl.JugadorServiceImpl;
import com.info.servicio.entrada.console.inputService;

public class EquipoServiceImpl implements EquipoService {
    private final EntrenadorService entrenadorservice = new EntrenadorServiceImpl();
    //ESTO SE DEBE BORRAR
    public static void main(String[] args) {
        EquipoService servquipo = new EquipoServiceImpl();
        Equipo equipo = servquipo.crearEquipo();
        System.out.println(equipo.getJugadores().get(0).toString());



    }
    
    @Override
    public Equipo crearEquipo(){
        Equipo equipo = new Equipo();
         // Nombre del equipo
        System.out.print("iNGRESAR EL NOMBRE DEL EQUIPO: ");
        equipo.setNombre(inputService.getScanner().nextLine().toLowerCase());
        // declaracion de fecha de creación
        System.out.println("Ahora se va a ingresar la fecha de creacion del club");
        System.out.print("Ingresar año: ");
        int año = inputService.getScanner().nextInt();
        System.out.print("Ingresar mes: ");
        int mes = inputService.getScanner().nextInt();
        System.out.print("Ingresar dia: ");
        int dia = inputService.getScanner().nextInt();
        System.out.println("");
        equipo.setFechaDeCreacion(LocalDate.of(año, mes, dia));
        // Creacion del entrenador
        Entrenador entrenador = entrenadorservice.crearEntrenador();
        equipo.setEntrenador(entrenador);
        inputService.getScanner().nextLine();
         while (equipo.getJugadores().size()<2){
            JugadorService jugadorserv = new JugadorServiceImpl();
            Jugador jugador = jugadorserv.crearJugador();
            equipo.getJugadores().add(jugador);
            jugador.setEquipo(equipo);
        } 

        return equipo;
    }
    @Override
    public void mostrarEquipo(List<Equipo> listaDeEquipos){
        EquipoService buscarEquipo = new EquipoServiceImpl();
        Equipo equipo = buscarEquipo.buscarEquipo(listaDeEquipos);
        if(equipo.getNombre()!=null){
            System.out.println("\nNOMBRE DEL EQUIPO: "+equipo.getNombre());
            System.out.println("NOMBRE DEL ENTRENADOR: "+equipo.getEntrenador().getNombre());
            for(Jugador jugador: equipo.getJugadores()){
                if(jugador.getEsCapitan()){
                    System.out.println("NOMBRE DE LOS CAPITANES DEL EQUIPO: "+jugador.getNombre());
                }
            }
        }else{
            System.out.println("\nNO SE ENCONTRO NINGUN EQUIPO CON ESE NOMBRE");
        }
    }
    @Override
    public void buscarEquipoMostrarJugadores(List<Equipo> listaDeEquipos){
        EquipoService buscarEquipo = new EquipoServiceImpl();
        Equipo equipo = buscarEquipo.buscarEquipo(listaDeEquipos);
        if(equipo.getNombre()!=null){
            System.out.println("\nNOMBRE DEL EQUIPO: "+equipo.getNombre());
            System.out.println("NOMBRE DEL ENTRENADOR: "+equipo.getEntrenador().getNombre());
            System.out.println("JUGADORES: "+equipo.getJugadores());
        } else {
            System.out.println("\nNO SE ENCONTRO NINGUN EQUIPO CON ESE NOMBRE");
        }
    }
    @Override
    public Equipo buscarEquipo(List<Equipo> listaDeEquipos){
        Equipo equipob = new Equipo();
        System.out.print("INGRESAR EL NOMBRE DEL EQUIPO QUE DESEA ENCONTRAR: ");
        String nombreEquipo = inputService.getScanner().nextLine().toLowerCase();
        for(Equipo equipo: listaDeEquipos){
            if(equipo.getNombre().equals(nombreEquipo)){
                equipob = equipo;
            }else {
            }
        }
        return equipob;
    }
    @Override
    public void eliminarEquipo(List<Equipo> listaDeEquipos){
        EquipoService buscarEquipo = new EquipoServiceImpl();
        System.out.println("\nACONTINUACIÓN INGRESARA EL NOMBRE DEL EQUIPO QUE DESEA ELIMINAR");
        Equipo equipo = buscarEquipo.buscarEquipo(listaDeEquipos);
        if(equipo.getNombre()!=null){
            listaDeEquipos.remove(equipo);
            System.out.println("EQUIPO ELIMINADO");
        }
    }
}

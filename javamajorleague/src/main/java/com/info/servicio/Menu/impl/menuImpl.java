package com.info.servicio.Menu.impl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.info.domain.Entrenador;
import com.info.domain.Equipo;
import com.info.domain.Jugador;
import com.info.servicio.Equipo.EquipoService;
import com.info.servicio.Equipo.impl.EquipoServiceImpl;
import com.info.servicio.Jugador.JugadorService;
import com.info.servicio.Jugador.impl.JugadorServiceImpl;
import com.info.servicio.Menu.menu;
import com.info.servicio.entrada.console.inputService;
import com.info.bootstrap.BootstrapData;

public class menuImpl implements menu{
    public static void main(String[] args) {
        menu menu = new menuImpl();
        menu.menuPrincipal();
    }
    @Override
    public void menuPrincipal(){
        //borrar
        BootstrapData.initEquipos();
        LocalDate date = LocalDate.of(1999, 01, 12);
        List <Jugador> jugadors = new ArrayList<>();
        Entrenador juan = new Entrenador("juan", "cuervo", 42);
        Equipo chupachicis = new Equipo("chupachichis",date,jugadors,juan);
        Jugador jugado1 = new Jugador("gonzalo", "delgado", 1.56F, "delantero", 100, 10, true, 19,chupachicis);
        Jugador jugado2 = new Jugador("jose", "delgado", 1.56F, "delantero", 100, 10, false, 19,chupachicis);
        //borrar
        boolean flag = true;
        List<Equipo> listaDeEquipos = new ArrayList<>();
        //borrar abajo
        listaDeEquipos.add(BootstrapData.equipos.get("equipo1"));
        listaDeEquipos.add(BootstrapData.equipos.get("equipo2"));
        listaDeEquipos.add(BootstrapData.equipos.get("equipo3"));  
        listaDeEquipos.add(chupachicis);
        while (flag){
        System.out.println("\nBIENVENIDO A LA MAJOR_LEAGUE_JAVA");
        System.out.println("1_CREAR EQUIPO");
        System.out.println("2_BUSCAR UN JUGADOR");
        System.out.println("3_BUSCAR EQUIPO");
        System.out.println("4_BUSCAR EQUIPO Y MOSTRAR JUGADORES");
        System.out.println("5_ELIMINAR EQUIPO");
        System.out.println("6_IMPORTAR LISTA DE JUGADORES DE UN EQUIPO DESDE UN ARCHIVO");
        System.out.println("7_EXPORTAR LISTA DE JUGADORES HACIA UN ARCHIVO");
        System.out.println("8_SALIR");
        System.out.print("INGRESE QUE OPCIÓN DESEADA: ");
        int opcion = inputService.getScanner().nextInt();
        inputService.getScanner().nextLine();
        switch (opcion) {
            case 1:
            EquipoServiceImpl service = new EquipoServiceImpl();
            Equipo equipo = service.crearEquipo();
            listaDeEquipos.add(equipo);
            break;
            case 2:
            JugadorService llamarJugador = new JugadorServiceImpl();
            llamarJugador.buscarJugador(listaDeEquipos);
            break;
            case 3:
            EquipoService llamarEquipo = new EquipoServiceImpl();
            llamarEquipo.mostrarEquipo(listaDeEquipos);
            break;
            case 4:
            EquipoService llamarEquipoyJugadores = new EquipoServiceImpl();
            llamarEquipoyJugadores.buscarEquipoMostrarJugadores(listaDeEquipos);
            break;
            case 5:
            EquipoService eliminarEquipo = new EquipoServiceImpl();
            eliminarEquipo.eliminarEquipo(listaDeEquipos);
            break;
            case 6:
            System.out.println("opcion 6");
            break;
            case 7:
            System.out.println("opcion 7");
            break;
            case 8:
            flag = false;
            break;
        }
        }
    }

}

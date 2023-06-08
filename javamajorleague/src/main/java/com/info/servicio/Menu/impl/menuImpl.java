package com.info.servicio.Menu.impl;
import java.util.ArrayList;
import java.util.List;
import com.info.domain.Equipo;
import com.info.domain.Jugador;
import com.info.servicio.Equipo.EquipoService;
import com.info.servicio.Equipo.impl.EquipoServiceImpl;
import com.info.servicio.Jugador.JugadorService;
import com.info.servicio.Jugador.impl.JugadorServiceImpl;
import com.info.servicio.Menu.menu;
import com.info.servicio.entrada.console.inputService;
import com.info.bootstrap.BootstrapData;
import com.info.servicio.entrada.console.file.inputFileService;
import com.info.servicio.entrada.console.file.imp.inputFileServiceImpl;
import com.info.salida.file.outPutFileService;
import com.info.salida.file.impl.outputFileServiceImpl;

public class menuImpl implements menu{
    private static final inputFileService inputFileService = new inputFileServiceImpl();
    private static final outPutFileService outputFileService = new outputFileServiceImpl();
    private static final EquipoServiceImpl service = new EquipoServiceImpl();
    private static final JugadorService llamarJugador = new JugadorServiceImpl();
    private static final EquipoService llamarEquipo = new EquipoServiceImpl();
    private static final EquipoService llamarEquipoyJugadores = new EquipoServiceImpl();
    private static final EquipoService eliminarEquipo = new EquipoServiceImpl();
    @Override
    public void menuPrincipal(){
        String rutaArchivo = "TP1/javamajorleague/src/main/java/com/info/resources/jugadores_entrada.txt";
        String rutaArchivoSalida = "TP1/javamajorleague/src/main/java/com/info/resources/jugadores_salida.txt";
        boolean flag = true;
        List<Equipo> listaDeEquipos = new ArrayList<>();
        // agrega los equipos desde boostrapdata
        for (Equipo equiposC: BootstrapData.equipos.values()){
            listaDeEquipos.add(equiposC);
        }
        while (flag){
        System.out.println("\nBIENVENIDO A LA MAJOR_LEAGUE_JAVA");
        System.out.println("1_CREAR EQUIPO");
        System.out.println("2_BUSCAR UN JUGADOR");
        System.out.println("3_BUSCAR EQUIPO");
        System.out.println("4_BUSCAR EQUIPO Y MOSTRAR JUGADORES");
        System.out.println("5_ELIMINAR EQUIPO");
        System.out.println("6_IMPORTAR LISTA DE JUGADORES DE UN EQUIPO DESDE UN ARCHIVO");
        System.out.println("7_EXPORTAR LISTA DE JUGADORES HACIA UN ARCHIVO");
        System.out.println("8_MOSTRAR TODOS LOS NOMBRES DE EQUIPOS DISPONIBLES");
        System.out.println("9_SALIR");
        System.out.print("INGRESE QUE OPCIÓN DESEADA: ");
        int opcion = inputService.getScanner().nextInt();
        inputService.getScanner().nextLine();
        switch (opcion) {
            case 1:
            Equipo equipo = service.crearEquipo();
            listaDeEquipos.add(equipo);
            break;
            case 2:
            llamarJugador.buscarJugador(listaDeEquipos);
            break;
            case 3:
            llamarEquipo.mostrarEquipo(listaDeEquipos);
            break;
            case 4:
            llamarEquipoyJugadores.buscarEquipoMostrarJugadores(listaDeEquipos);
            break;
            case 5:
            eliminarEquipo.eliminarEquipo(listaDeEquipos);
            break;
            case 6:
            List<Jugador> listaJugadores = inputFileService.loadPlayersByFile(rutaArchivo);
            Equipo equipoimp = llamarEquipo.buscarEquipo(listaDeEquipos);
            for (Jugador jugador: listaJugadores){
                jugador.setEquipo(equipoimp);
            }
            equipoimp.setJugadores(listaJugadores);
            System.out.println("\nJUGADORES IMPORTADOS!!!");
            break;
            case 7:
            Equipo equipoext = llamarEquipo.buscarEquipo(listaDeEquipos);
            outputFileService.exportPlayers(equipoext.getJugadores(), rutaArchivoSalida);
            System.out.println("\nJUGADORES EXPORTADOS!!");
            break;
            case 8:
            System.out.println("\n");
            for(Equipo equipos: listaDeEquipos){
                System.out.println("NOMBRE DEL EQUIPO: "+equipos.getNombre());
            }
            break;
            case 9:
            flag = false;
            break;
        }
        }
    }

}

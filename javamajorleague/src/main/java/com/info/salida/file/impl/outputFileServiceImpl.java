package com.info.salida.file.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.info.domain.Jugador;
import com.info.salida.file.outPutFileService;

public class outputFileServiceImpl implements outPutFileService {
    
    @Override
    public void exportPlayers(List<Jugador> jugadores, String rutaDestino){

        try(BufferedWriter writer = new BufferedWriter( new FileWriter(rutaDestino))) {
            
            for(Jugador jugador: jugadores){

                String linea = jugador.getNombre() + ";" +
                               jugador.getApellido() + ";" +
                               jugador.getAltura() + ";" +
                               jugador.getPosicionQueJuega() + ";" +
                               jugador.getCantidadDeGoles() + ";" +
                               jugador.getCantidadDePartidos() + ";" +
                               jugador.getEsCapitan() + ";" +
                               jugador.getDorsal() + ";" +
                               ((jugador.getEquipo() != null)?jugador.getEquipo().getNombre():"");
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}

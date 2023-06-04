package com.info.servicio.entrada.console.file.imp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.commons.io.FileUtils;

import com.info.domain.Jugador;
import com.info.servicio.entrada.console.file.inputFileService;

public class inputFileServiceImpl implements inputFileService {
    public List<Jugador> loadPlayersByFile(String rutaArchivo){
        
        //inicializacion lista de jugadores
        List<Jugador> jugadores = new ArrayList<>();
      /*   
        try {
            // linea del archivo
            List<String> lineas = FileUtils.readLines(new File(rutaArchivo), StandardCharsets.UTF_8);
            
            // Linea es un jugador
            for (String linea : lineas) {
                //partes de la linea
                String[] partes = linea.split(";");
                String nombre = partes[0];
                String apellido = partes[1];
                Float altura = Float.parseFloat(partes[2]);
                String posicionQueJuega = partes[3];
                int cantidadDeGoles =Integer.parseInt(partes[4]);
                int cantiadadDePartidos = Integer.parseInt(partes[5]);
                boolean esCapitan = Boolean.parseBoolean(partes[6]);
                int dorsal = Integer.parseInt(partes[7]);

            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } */
        return null;
    }
}

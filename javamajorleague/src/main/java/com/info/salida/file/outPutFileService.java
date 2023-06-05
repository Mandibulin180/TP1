package com.info.salida.file;

import java.util.List;

import com.info.domain.Jugador;

public interface outPutFileService {
    
    void exportPlayers(List<Jugador> jugadores, String rutaDestino);
}

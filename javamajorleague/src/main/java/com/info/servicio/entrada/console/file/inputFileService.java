package com.info.servicio.entrada.console.file;

import java.util.List;
import com.info.domain.Jugador;

public interface inputFileService {
    
    // cargar jugadores por archivo
    List<Jugador> loadPlayersByFile(String rutaArchivo);
}
